package spreadsheet;

import quickcheck.Generator;
import quickcheck.BooleanGenerator;
import spreadsheet.logical.*;

public final class LExpressionGenerator extends Generator<LExpressionInfo> {

  private final BooleanGenerator LExpressionGeneratorGen;

  public LExpressionGenerator() {
    this.LExpressionGeneratorGen = new BooleanGenerator();
  }

  public LExpressionInfo next() {
    final boolean logical = this.LExpressionGeneratorGen.next();
    final Expression expression = new LConst( logical );
    return new LExpressionInfo( expression, logical );
  }

}
