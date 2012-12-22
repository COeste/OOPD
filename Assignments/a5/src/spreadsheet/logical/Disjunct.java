package spreadsheet.logical;

import spreadsheet.Expression;

//A binary operation performing a logical disjunction on a pair of expressions
public class Disjunct extends LExpression {
  
  private final boolean val;
  
  public Disjunct( final Expression a, final Expression b ) {
    this.val = a.toBoolean() || b.toBoolean();
  }
  
  protected boolean getVal() {
    return this.val;
  }

}