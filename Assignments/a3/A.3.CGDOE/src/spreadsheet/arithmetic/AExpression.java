package spreadsheet.arithmetic;

import spreadsheet.Expression;

//Arithmetic expression, defines conversion methods
abstract class AExpression extends Expression {

  protected abstract int getVal();
  
  public boolean toBoolean() {
    return this.getVal() != 0;
  }
  
  public int toInt() {
    return this.getVal();
  }

  public String toString() {
    return Integer.toString( this.getVal() );
  }

}