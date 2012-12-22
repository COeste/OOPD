package spreadsheet.logical;

import spreadsheet.Expression;

//A unary operation performing a logical negation of an expression
public class Not extends LExpression {
  
  private final boolean val;
  
  public Not( final Expression b ) {
    this.val = !b.toBoolean();
  }
  
  protected boolean getVal() {
    return this.val;
  }

}