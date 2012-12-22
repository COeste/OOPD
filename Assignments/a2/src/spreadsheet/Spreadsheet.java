package spreadsheet;
import spreadsheet.DynamicArrayMap;

//A spreadsheet of Nodes.
public class Spreadsheet {
  private DynamicArrayMap spreadsheet;
  
  public Spreadsheet() {
    this.spreadsheet = new DynamicArrayMap();
  }
  
  public void set( final Position position, final Expression expression ) {
    this.spreadsheet.insert( position, expression );
  }
  
  public void set( final Node node ) {
    this.spreadsheet.insert( node );
  }
  
  public Expression get( final Position position ) {
    return spreadsheet.lookup( position );
  }
}