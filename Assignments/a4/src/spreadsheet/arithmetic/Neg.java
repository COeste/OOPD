package spreadsheet.arithmetic;

import spreadsheet.Expression;

public final class Neg extends UnaryArithmeticExpression {

  public Neg(final Expression operand) {
    super(operand);
  }

  @Override
  protected int evaluate() {
    return -1;
//    final int x = this.operand.toInt();
//    return -1 * x;
  }

}
