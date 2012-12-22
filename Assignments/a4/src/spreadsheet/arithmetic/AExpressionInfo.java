package spreadsheet;

import quickcheck.Info;
import spreadsheet.arithmetic.*;

public final class AExpressionInfo extends Info<Expression> {

  private final int arithmetic;

  public AExpressionInfo( final Expression expression, final int arithmetic ) {
    super(expression);
    this.arithmetic = arithmetic;
  }

  public int getExpression() {
    return this.arithmetic;
  }
  
  public String toString() {
    return String.format("new Expression(arithmetic, %d)", this.arithmetic );
  }

}
