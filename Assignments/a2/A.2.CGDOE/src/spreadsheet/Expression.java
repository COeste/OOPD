package spreadsheet;

/* Immutable. */
public class Expression {

  private String value;

  /* Assumes that value is an instance of String. */
  public Expression(final String value) {
    this.value = value;
  }
  
  public String getValue() {
    return value;
  }

  public boolean toBoolean() {
    return this.value.length() > 0;
  }

  /* Guaranteed to be nonnegative. */
  public int toInt() {
    return this.value.length();
  }
  
  public boolean isEqualTo( final Expression other ) {
    return this.value.equals( other.value );
  }

}
