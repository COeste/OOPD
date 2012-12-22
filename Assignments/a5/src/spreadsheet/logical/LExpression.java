package spreadsheet.logical;

import spreadsheet.Expression;

//Logical expression, defines conversion methods
abstract class LExpression extends Expression {

  protected abstract boolean getVal();
  
  public boolean toBoolean() {
    return this.getVal();
  }
  
  public int toInt() {
    if( this.getVal() ) {
      return 1;
    }
    return 0;
  }

  public String toString() {
    if( this.getVal() ) {
      return "true";
    }
    return "false";
  }

}