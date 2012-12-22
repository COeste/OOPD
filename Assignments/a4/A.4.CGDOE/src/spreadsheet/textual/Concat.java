package spreadsheet.textual;

import spreadsheet.Expression;

public final class Concat extends BinaryTextualExpression {

  public Concat(
      final Expression firstOperand,
      final Expression secondOperand) {
    super(firstOperand, secondOperand);
  }

  @Override
  protected String evaluate() {
    final String x = firstOperand.toString();
    final String y = secondOperand.toString();
    return y + x;
//    return x + y;
  }

}
