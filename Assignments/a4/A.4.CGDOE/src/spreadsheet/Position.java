package spreadsheet;

/* Immutable. */
public class Position {

  private int column, row;

  /* Assume column, row are nonnegative. */
  public Position(final int column, final int row) {
    this.column = column;
    this.row = row;
  }

  /* Guaranteed nonnegative. */
  public int getColumn() {
    return this.column;
  }

  /* Guaranteed nonnegative. */
  public int getRow() {
    return this.row;
  }

  /* Assume other is an instance of Position. */
  public boolean isEqualTo(final Position other) {
    return
      this.column == other.column &&
      this.row == other.row;
  }

}
