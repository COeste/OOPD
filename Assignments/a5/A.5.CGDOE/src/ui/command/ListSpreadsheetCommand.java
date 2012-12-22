package ui.command;

import spreadsheet.Application;

public final class ListSpreadsheetCommand extends Command {

  public void execute() {
    Iterable<String> spreadsheets = Application.instance.listSpreadsheets();
    for(String spreadsheet : spreadsheets ) {
      System.out.println( spreadsheet );
    }
  }
  
}