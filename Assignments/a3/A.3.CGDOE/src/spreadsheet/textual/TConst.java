package spreadsheet.textual;

import spreadsheet.Expression;

//A textual constant
public class TConst extends TExpression {
  
  private final String val;
  
  public TConst( final String s ) {
    this.val = s;
  }
  
  protected String getVal() {
    return this.val;
  }

}