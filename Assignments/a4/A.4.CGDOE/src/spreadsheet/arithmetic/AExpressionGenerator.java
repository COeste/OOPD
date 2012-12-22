package spreadsheet;

import quickcheck.Generator;
import quickcheck.IntegerGenerator;
import spreadsheet.arithmetic.*;

public final class AExpressionGenerator extends Generator<AExpressionInfo> {

  private final IntegerGenerator AExpressionGeneratorGen;

  public AExpressionGenerator() {
    this.AExpressionGeneratorGen = new IntegerGenerator();
  }

  public AExpressionInfo next() {
    final int arithmetic = this.AExpressionGeneratorGen.next();
    final Expression expression = new AConst( arithmetic );
    return new AExpressionInfo( expression, arithmetic );
  }

}
