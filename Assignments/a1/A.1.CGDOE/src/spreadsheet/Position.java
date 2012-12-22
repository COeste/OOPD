package spreadsheet;

//Stores the position in a spreadsheet
public class Position {

  private int pColumn;
  private int pRow;
  
  //Constructor
  public Position( final int column, final int row ) {
    pColumn = column;
    pRow = row;
  }
  
  public int getColumn() {
    return pColumn;
  }
  
  public int getRow() {
    return pRow;
  }
  
  public boolean isEqualTo( final Position other ) {
    return ( other.getColumn() == pColumn && other.getRow() == pRow );
  }
  
}