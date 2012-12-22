package spreadsheet;

public final class Spreadsheet {

  private DynamicArrayMap map;
  private String name;
  private static int counter = 0;

  public Spreadsheet() {
    this.map = new DynamicArrayMap();
    this.name = String.format( "Sheet%d", Spreadsheet.counter );
    Spreadsheet.counter++;
  }

  /* Assume position and expression are not null. */
  public void set(final Position position, final Expression expression) {
    this.map.insert(position, expression);
  }

  /* assume position is not null.
   * null if the position is not associated with an expression. */
  public Expression get(final Position position) {
    return this.map.lookup(position);
  }
  
  public String getName() {
    return this.name;
  }

}
