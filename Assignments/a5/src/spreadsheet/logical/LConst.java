package spreadsheet.logical;

import spreadsheet.Expression;

//A logical constant
public class LConst extends LExpression {
  
  private final boolean val;
  
  public LConst( final boolean b ) {
    this.val = b;
  }
  
  protected boolean getVal() {
    return this.val;
  }

}