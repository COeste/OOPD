package spreadsheet.logical;

import spreadsheet.Expression;

abstract class BinaryLogicalExpression extends LogicalExpression{

  protected Expression firstOperand, secondOperand;

  protected BinaryLogicalExpression(
      final Expression firstOperand,
      final Expression secondOperand) {
    this.firstOperand = firstOperand;
    this.secondOperand = secondOperand;
  }

}
