package ui.command;

import java.util.Scanner;

import spreadsheet.*;
import spreadsheet.arithmetic.*;
import spreadsheet.logical.*;
import spreadsheet.textual.*;

public final class SetCommand extends Command {
  
  private Scanner scanner;
  private Position position;
  
  public SetCommand( Scanner scanner ) {
    this.scanner = scanner;
  }
  
  private Position createPosition() {
    return new Position( Integer.parseInt( this.scanner.next() ),
                         Integer.parseInt( this.scanner.next() ));
  }
  
  private Expression createExpression() {
    String key = this.scanner.next();
    Expression returnVal = null;
    switch( key ) {
      case "AConst":
        returnVal = new AConst( Integer.parseInt( this.scanner.next() ) );
        break;
      case "Add":
        returnVal = new Add( createExpression(), createExpression() );
        break;
      case "Neg":
        returnVal = new Neg( createExpression() );
        break;
      case "CellReference":
        String name = this.scanner.next();
        try {
          returnVal = Application.instance.getSpreadsheet( name ).get( createPosition() );
        }
        catch( NoSuchSpreadsheetException e ) {
          System.out.println( "Error: No spreadsheet with name: " + name + 
                              " exists.");
        }
        break;
      default:
        break;
    }
    return returnVal;
  }
  
  public void execute() {
    Position position = createPosition();
    Expression expression = createExpression();
    if( !( expression == null ) ) {
      Application.instance.getWorksheet().set( position, expression );
    }
    else {
      System.out.println( "Invalid command parameters" );
    }
  }
  
}