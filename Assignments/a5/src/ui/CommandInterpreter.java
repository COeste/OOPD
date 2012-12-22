package ui;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import ui.command.*;

import spreadsheet.*;
import spreadsheet.arithmetic.*;

public final class CommandInterpreter {

  private CommandInterpreter() {
    // The class should not be instanciated.
  }

  public static Command interpret(final Scanner scanner) {
    final String keyword = scanner.next();
    switch(keyword) {
      case "pws":
        return new GetWorksheetCommand();
      case "ns":
        return new NewSpreadsheetCommand();
      case "ls":
        return new ListSpreadsheetCommand();
      case "cws":
        return new ChangeWorksheetCommand( scanner );
      case "set":
        return new SetCommand( scanner );
      case "get":
        return new GetCommand( scanner );
      case "exit":
        return new ExitCommand();
    }
    return new FailedCommand(
      String.format("Illegal start of command, \"%s\".", keyword));
  }

}
