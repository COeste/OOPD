package spreadsheet.arithmetic;

import spreadsheet.Expression;

//An arithmetic constant
public class AConst extends AExpression {

  private final int val;
  
  public AConst( final int i ) {
    this.val = i;
  }
  
  protected int getVal() {
    return val;
  }
  
}