package shape;
import shape.Cube;
import shape.Point;

public class Shape {
  private Point position;
  private Cube obj;
  private int rotA;
  private int rotB;
  
  public Shape( final Point a,
                final int alpha,
                final int beta,
                final Cube cube ) {
    position = a;
    obj = cube;
    rotA = alpha;
    rotB = beta;
  }
  
  public Point getPosition() {
    return position;
  }
  
  public Cube getObject() {
    return obj;
  }
  
  public int getAlphaRotation() {
    return rotA;
  }
  
  public int getBetaRotation() {
    return rotB;
  }
  
  void move( final Point b ) {
    position = b;
  }
}