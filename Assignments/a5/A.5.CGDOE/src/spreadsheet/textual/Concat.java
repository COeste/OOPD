package spreadsheet.textual;

import spreadsheet.Expression;

//A binary operation concatenating two expressions
public class Concat extends TExpression {
  
  private final String val;
  
  public Concat( final Expression a, final Expression b ) {
    this.val = a.toString() + b.toString();
  }
  
  protected String getVal() {
    return this.val;
  }

}