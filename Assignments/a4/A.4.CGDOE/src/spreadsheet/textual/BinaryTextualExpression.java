package spreadsheet.textual;

import spreadsheet.Expression;

abstract class BinaryTextualExpression extends TextualExpression{

  protected Expression firstOperand, secondOperand;

  protected BinaryTextualExpression(
      final Expression firstOperand,
      final Expression secondOperand) {
    this.firstOperand = firstOperand;
    this.secondOperand = secondOperand;
  }

}
