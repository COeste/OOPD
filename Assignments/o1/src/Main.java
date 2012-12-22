import shape.Cube;
import shape.Point;
import shape.Shape;

class Main {

  public static void main(String[] _) {
    Cube cube = new Cube(5);
    Point point = new Point( 1, 2, 3);
    Shape shape = new Shape(point, 15, 30, cube);
    
    //Cube tests
    assert cube.getSurfaceArea() == 5 * 5 * 6;
    assert cube.getVolume() == 5 * 5 * 5;
    assert cube.getLengthOfFaceDiagonal() == (int) Math.sqrt( 2.0 * 5.0 * 5.0 );
    assert cube.getLengthOfSpaceDiagonal() == (int) Math.sqrt( 3.0 * 5.0 * 5.0 );
    
    //Point tests
    assert point.getX() == 1;
    assert point.getY() == 2;
    assert point.getZ() == 3;
    
    //Shape tests
    assert shape.getPosition() == point;
    assert shape.getAlphaRotation() == 15;
    assert shape.getBetaRotation() == 30;
    assert shape.getObject() == cube; 
  }
}