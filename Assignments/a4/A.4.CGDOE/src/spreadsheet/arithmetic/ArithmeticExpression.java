package spreadsheet.arithmetic;

import spreadsheet.Expression;

abstract class ArithmeticExpression extends Expression {

  protected abstract int evaluate();

  @Override
  public boolean toBoolean() {
    return this.evaluate() != 0;
  }

  @Override
  public int toInt() {
    return this.evaluate();
  }

  @Override
  public String toString() {
    return Integer.toString(this.evaluate());
  }

}
