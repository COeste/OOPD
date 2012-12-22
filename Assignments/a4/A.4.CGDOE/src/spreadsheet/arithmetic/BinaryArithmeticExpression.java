package spreadsheet.arithmetic;

import spreadsheet.Expression;

abstract class BinaryArithmeticExpression extends ArithmeticExpression {

  protected Expression firstOperand, secondOperand;

  protected BinaryArithmeticExpression(
      final Expression firstOperand,
      final Expression secondOperand) {
    this.firstOperand = firstOperand;
    this.secondOperand = secondOperand;
  }

}
