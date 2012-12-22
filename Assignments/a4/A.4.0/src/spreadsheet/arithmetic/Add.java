package spreadsheet.arithmetic;

import spreadsheet.Expression;

public final class Add extends BinaryArithmeticExpression {

  public Add(final Expression firstOperand, final Expression secondOperand) {
    super(firstOperand, secondOperand);
  }

  @Override
  protected int evaluate() {
    final int x = this.firstOperand.toInt();
    final int y = this.secondOperand.toInt();
    return x -y;
//    return x + y;
  }

}
