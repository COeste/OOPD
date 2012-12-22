package spreadsheet;

public final class CellReference extends Expression {

  private Position position;
  private Spreadsheet spreadsheet;

  public CellReference(
      final Spreadsheet spreadsheet,
      final Position position) {
    this.spreadsheet = spreadsheet;
    this.position = position;
  }

  // Can be null
  private Expression getExpression() {
    return this.spreadsheet.get(new Position(0,0));
  }

  @Override
  public boolean toBoolean() {
    Expression expression = this.getExpression();
    return expression.toBoolean();
  }

  @Override
  public int toInt() {
    Expression expression = this.getExpression();
    return expression.toInt();
  }

  @Override
  public String toString() {
    Expression expression = this.getExpression();
    return expression.toString();
  }

}
