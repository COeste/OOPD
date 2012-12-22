package spreadsheet;

import quickcheck.Info;
import spreadsheet.logical.*;

public final class LExpressionInfo extends Info<Expression> {

  private final boolean logical;

  public LExpressionInfo( final Expression expression, final boolean logical ) {
    super(expression);
    this.logical = logical;
  }

  public boolean getExpression() {
    return this.logical;
  }
  
  public String toString() {
    return String.format("new Expression(logical, %b)", this.logical );
  }

}
