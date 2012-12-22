package ui.command;

import java.util.Scanner;

import spreadsheet.Application;
import spreadsheet.Position;

public final class GetCommand extends Command {
  
  private Scanner scanner;
  private Position position;
  
  public GetCommand( Scanner scanner ) {
    this.scanner = scanner;
  }
  
  private Position createPosition() {
    return new Position( Integer.parseInt( this.scanner.next() ),
                         Integer.parseInt( this.scanner.next() ));
  }
  
  public void execute() {
    Position position = createPosition();
    System.out.println( Application.instance.getWorksheet().get( position ).toString() );
  }
  
}