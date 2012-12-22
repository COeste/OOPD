package shape;

public class Point {
  
  private int xCoord;
  private int yCoord;
  private int zCoord;
  
  public Point( final int x, final int y, final int z ) {
    xCoord = x;
    yCoord = y;
    zCoord = z;
  }
  
  public int getX() {
    return xCoord;
  }
  
  public int getY() {
    return yCoord;
  }
  
  public int getZ() {
    return zCoord;
  }
}