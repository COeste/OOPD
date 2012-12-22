import spreadsheet.Position;
import spreadsheet.Expression;

class Main {

  public static void main(String[] _) {
    final Position tempPos = new Position(3,5);
    final Expression tempExp1 = new Expression("Test");
    final Expression tempExp2 = new Expression("");
    
    //Tests for Position
    assert tempPos.getColumn() == 3;
    assert tempPos.getRow() == 5;
    //Tests for Expression
    assert tempExp1.toBoolean() == true;
    assert tempExp1.toInt() == 4;
    assert tempExp2.toBoolean() == false;
    assert tempExp2.toInt() == 0;
  }

}
