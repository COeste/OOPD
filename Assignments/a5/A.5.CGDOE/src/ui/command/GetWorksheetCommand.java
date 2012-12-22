package ui.command;

import spreadsheet.Application;

public final class GetWorksheetCommand extends Command {

  public void execute() {
    System.out.println( Application.instance.getWorksheet().getName() );
  }
  
}