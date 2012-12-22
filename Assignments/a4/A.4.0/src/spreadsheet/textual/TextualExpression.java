package spreadsheet.textual;

import spreadsheet.Expression;

abstract class TextualExpression extends Expression {

  protected abstract String evaluate();

  @Override
  public boolean toBoolean() {
    if (this.evaluate().equals("")) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public int toInt() {
    return this.evaluate().length();
  }

  @Override
  public String toString() {
    return this.evaluate();
  }

}
