package spreadsheet;

import quickcheck.Generator;
import quickcheck.IntegerGenerator;
import spreadsheet.textual.*;

public final class TExpressionGenerator extends Generator<TExpressionInfo> {

  private final IntegerGenerator TExpressionGeneratorGen;

  public TExpressionGenerator() {
    this.TExpressionGeneratorGen = new IntegerGenerator( 33, 126 );
  }

  public TExpressionInfo next() {
    final String textual = stringGen();
    final Expression expression = new TConst( textual );
    return new TExpressionInfo( expression, textual );
  }
  
  //Generates a random string with 0 <= length < 11
  private String stringGen() {
    String returnString = "";
    int size = this.TExpressionGeneratorGen.next() % 11;
    for( int i = 0; i < size; i++ ) {
      int tempInt = this.TExpressionGeneratorGen.next();
      char tempChar = (char)tempInt;
      returnString += tempChar;
    }
    return returnString;
  }

}
