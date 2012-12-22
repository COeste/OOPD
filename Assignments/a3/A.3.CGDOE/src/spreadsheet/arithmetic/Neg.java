package spreadsheet.arithmetic;

import spreadsheet.Expression;

//A unary operation for negating (sign-flip) arithmetic expressions
public class Neg extends AExpression {

  private final int val;
  
  public Neg( final Expression a ) {
    this.val = a.toInt() * -1;
  }
  
  protected int getVal() {
    return val;
  }

}