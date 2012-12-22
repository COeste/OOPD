package spreadsheet.logical;

import spreadsheet.Expression;

//A binary operation performing a logical conjunction on a pair of expressions
public class Conjunct extends LExpression {
  
  private final boolean val;
  
  public Conjunct( final Expression a, final Expression b ) {
    this.val = a.toBoolean() && b.toBoolean();
  }
  
  protected boolean getVal() {
    return this.val;
  }

}