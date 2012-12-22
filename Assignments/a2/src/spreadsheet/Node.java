package spreadsheet;
import spreadsheet.Expression;
import spreadsheet.Position;

//A node containing an Expression and a Position.
public class Node {
  private final Position position;
  private final Expression expression;
  
  public Node( final Position position, final Expression expression ) {
    this.position = position;
    this.expression = expression;
  }
  
  public Position getKey() {
    return this.position;
  }
  
  public Expression getValue() {
    return this.expression;
  }
  
  //Checks if the Nodes Position-Expression pair is identical to anothers.
  public boolean isEqualTo( final Node other ) {
    return this.position.isEqualTo( other.position ) &&
           this.expression.isEqualTo( other.expression );
  }
}