package spreadsheet;

import quickcheck.Values;


public class ExpressionTest {

  private AExpressionGenerator aExpressionGen;
  private LExpressionGenerator lExpressionGen;
  private TExpressionGenerator tExpressionGen;

  @org.junit.Before
  public void initializeExpressionGenerator() {
    this.aExpressionGen = new AExpressionGenerator();
    this.lExpressionGen = new LExpressionGenerator();
    this.tExpressionGen = new TExpressionGenerator();
  }

  @org.junit.Test
  public void testGetExpression() {

    final Values<AExpressionInfo> aInfos =
      new Values<AExpressionInfo>(this.aExpressionGen);

    for (final AExpressionInfo info : aInfos) {
      final int expected = info.getExpression();
      final int actual = info.getValue().toInt();

      if (actual == expected) {
        continue;
      }

      System.err.println( "getExpression() failed. " + info + " Expected " + 
                          expected + " Found " + actual );
    }
    
    final Values<LExpressionInfo> lInfos =
      new Values<LExpressionInfo>(this.lExpressionGen);

    for (final LExpressionInfo info : lInfos) {
      final boolean expected = info.getExpression();
      final boolean actual = info.getValue().toBoolean();

      if (actual == expected) {
        continue;
      }

      System.err.println( "getExpression() failed. " + info + " Expected " + 
                          expected + " Found " + actual );
    }
    
    final Values<TExpressionInfo> tInfos =
      new Values<TExpressionInfo>(this.tExpressionGen);

    for (final TExpressionInfo info : tInfos) {
      final String expected = info.getExpression();
      final String actual = info.getValue().toString();

      if (actual == expected) {
        continue;
      }

      System.err.println( "getExpression() failed. " + info + " Expected " + 
                          expected + " Found " + actual );
    }
  }
}
