package spreadsheet;
import spreadsheet.Node;

//A Single linked list of Node
public class SinglyLinkedListMap {
  private Node node;
  private SinglyLinkedListMap next;
  
  public SinglyLinkedListMap() {
    this.node = null;
    this.next = null;
  }
  
  //Takes a Position and Expression as input, creating a new Node at the end of 
  //the list.
  public void insert( final Position key, final Expression value ) {
    if( this.node == null ) {
      this.node = new Node( key, value );
      this.next = new SinglyLinkedListMap();
    }
    else {
      this.next.insert( key, value );
    }
  }
  
  //Takes a Node as input, adding it to the end of the list.
  public void insert( final Node node ) {
    if( this.node == null ) {
      this.node = node;
      this.next = new SinglyLinkedListMap();
    }
    else {
      this.next.insert( node );
    }
  }
  
  //Goes through the list looking for a specific Node position. Returns the 
  //matching Expression if found. Returns null otherwise.
  public Expression lookup( final Position key ) {
    if( this.node == null ) {
      return null;
    }
    else if( this.node.getKey().isEqualTo( key )) {
      return this.node.getValue();
    }
    else {
      return this.next.lookup( key );
    }
  }
}