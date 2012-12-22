package spreadsheet;

//Refers to a specific cell, e.g. (1,1), in some instance of a spreadsheet
public class CellReference extends Expression {
  
  private final Position position;
  private final Spreadsheet spreadsheet;
  
  public CellReference( final Spreadsheet spreadsheet, final Position pos ) {
    this.spreadsheet = spreadsheet;
    this.position = pos;
  }
  
  public boolean toBoolean() {
    return this.spreadsheet.get( position ).toBoolean();
  }
  
  public int toInt() {
    return this.spreadsheet.get( position ).toInt();
  }
  
  public String toString() {
    return this.spreadsheet.get( position ).toString();
  }
}