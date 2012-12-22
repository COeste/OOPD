package spreadsheet.arithmetic;

import spreadsheet.Expression;

abstract class UnaryArithmeticExpression extends ArithmeticExpression {

  protected final Expression operand;

  protected UnaryArithmeticExpression(
      final Expression operand) {
    this.operand = operand;
  }

}
