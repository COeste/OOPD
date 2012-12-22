package shape;

public class Cube {

  int edge;
  
  public Cube( final int a ) {
    edge = a;
  }
  
  public int getSurfaceArea() {
    return edge * edge * 6;
  }

  public int getVolume() {
    return edge * edge * edge;
  }
  
  public int getLengthOfFaceDiagonal() {
    return (int) Math.sqrt( (double)( 2 * edge * edge ) );
  }
  
  public int getLengthOfSpaceDiagonal() {
    return (int) Math.sqrt( (double)( 3 * edge * edge ) );
  }
  
}