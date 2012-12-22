package spreadsheet;

/* Immutable. */
public class Expression {

  private String value;

  /* Assumes that value is an instance of String. */
  public Expression(final String value) {
    this.value = value;
  }

  public boolean toBoolean() {
    return this.value.length() > 0;
  }

  /* Guaranteed to be nonnegative. */
  public int toInt() {
    return this.value.length();
  }

}
