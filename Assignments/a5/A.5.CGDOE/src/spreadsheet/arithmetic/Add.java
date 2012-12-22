package spreadsheet.arithmetic;

import spreadsheet.Expression;

//A binary operation for adding arithmetic expressions
public class Add extends AExpression {

  private final int val;
  
  public Add( final Expression a, final Expression b ) {
    this.val = a.toInt() + b.toInt();
  }
  
  protected int getVal() {
    return val;
  }

}