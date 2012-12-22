package spreadsheet;

import java.util.ArrayList;

/** A singleton class representing a spreadsheet application.
 *
 * The instance is initialized on first mention of the class.
 */
public final class Application {

  private ArrayList<Spreadsheet> spreadsheets;
  private Spreadsheet worksheet;

  public static final Application instance = new Application();

  private Application() {
    this.worksheet = new Spreadsheet();
    this.spreadsheets = new ArrayList<Spreadsheet>();
    this.spreadsheets.add(this.worksheet);
  }
  
  /**
   * Returns the current worksheet. Guaranteed to be be not null.
   */
  public Spreadsheet getWorksheet() {
    return this.worksheet;
  }
  
  /**
   * Initializes a new empty spreadsheet; the worksheet is retained.
   */
  public void newSpreadsheet() {
    spreadsheets.add( new Spreadsheet() );
  }
  
  /**
   * Returns a reference to the desired spreadsheet.
   * Throws NoSuchSpreadsheetException if there is no spreadsheet by the
   * specified name.
   */
  public Spreadsheet getSpreadsheet( final String name )
  throws NoSuchSpreadsheetException {
    for( int i = 0; i < spreadsheets.size(); i++ ) {
      if( spreadsheets.get( i ).getName().equals( name ) ) {
        return spreadsheets.get( i );
      }
    }
    throw new NoSuchSpreadsheetException( name );
  }
  
  /**
   * Changes the worksheet to be the given spreadsheet.
   * Throws NoSuchSpreadsheetException if there is no spreadsheet by the
   * specified name.
   */
  public void changeWorksheet( final String name )
    throws NoSuchSpreadsheetException {
    this.worksheet = getSpreadsheet( name );
  }
  
  /**
   * Lists the currently active spreadsheets.
   */
  public Iterable<String> listSpreadsheets() {
    ArrayList<String> spreadsheetList = new ArrayList<String>();
    for( int i = 0; i < spreadsheets.size(); i++ ) {
      spreadsheetList.add( spreadsheets.get( i ).getName() );
    }
    return spreadsheetList;
  }

  /**
   * Exits the application with exit code 0.
   */
  public void exit() {
    System.exit(0);
  }

}
