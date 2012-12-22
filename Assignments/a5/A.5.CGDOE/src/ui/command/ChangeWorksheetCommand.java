package ui.command;

import java.util.Scanner;

import spreadsheet.Application;
import spreadsheet.NoSuchSpreadsheetException;

public final class ChangeWorksheetCommand extends Command {
  
  private Scanner scanner;
  
  public ChangeWorksheetCommand( Scanner scanner ) {
    this.scanner = scanner;
  }
  
  public void execute() {
    String name = scanner.next();
    try {
      Application.instance.changeWorksheet( name );
    }
    catch( NoSuchSpreadsheetException e ) {
      System.out.println( "Error: No spreadsheet with name: " + name + 
                          " exists.");
    }
  }
  
}