package spreadsheet;

import quickcheck.Info;
import spreadsheet.textual.*;

public final class TExpressionInfo extends Info<Expression> {

  private final String textual;

  public TExpressionInfo( final Expression expression, final String textual ) {
    super(expression);
    this.textual = textual;
  }

  public String getExpression() {
    return this.textual;
  }
  
  public String toString() {
    return "new Expression(textual, " + this.textual + ")";
  }

}
