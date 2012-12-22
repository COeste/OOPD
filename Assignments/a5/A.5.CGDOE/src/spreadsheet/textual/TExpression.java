package spreadsheet.textual;

import spreadsheet.Expression;

//Textual expression, defines conversion methods
abstract class TExpression extends Expression {

  protected abstract String getVal();
  
  public boolean toBoolean() {
    return this.getVal().length() != 0;
  }
  
  public int toInt() {
    return getVal().length();
  }

  public String toString() {
    return this.getVal();
  }

}