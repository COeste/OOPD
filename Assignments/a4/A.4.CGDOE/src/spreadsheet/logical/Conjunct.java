package spreadsheet.logical;

import spreadsheet.Expression;

public final class Conjunct extends BinaryLogicalExpression {

  public Conjunct(
      final Expression firstOperand,
      final Expression secondOperand) {
    super(firstOperand, secondOperand);
  }

  @Override
  protected boolean evaluate() {
    final boolean x = this.firstOperand.toBoolean();
    final boolean y = this.secondOperand.toBoolean();
    return x || y;
//    return x && y;
  }

}
