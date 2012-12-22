package spreadsheet;
import spreadsheet.Node;

//A dynamic array of Node
public class DynamicArrayMap {
  
  private Node[] array;
  
  public DynamicArrayMap() {
    this.array = new Node[0];
  }
  
  //Takes a Position and Expression as input, creating a new Node at the end of
  //the array.
  public void insert( final Position key, final Expression value ) {
    int arrayLength = this.array.length;
    Node[] temp = new Node[arrayLength + 1];
    
    for( int i = 0; i < arrayLength; i++ ) {
      temp[i] = this.array[i];
    }
    temp[arrayLength] = new Node( key, value );
    
    this.array = temp;
  }
  
  //Takes a Node as input, inserting it at the end of the array.
  public void insert( final Node node ) {
    int arrayLength = this.array.length;
    Node[] temp = new Node[arrayLength + 1];
    
    for( int i = 0; i < arrayLength; i++ ) {
      temp[i] = this.array[i];
    }
    temp[arrayLength] = node;
    
    this.array = temp;
  }
  
  //Goes through the array looking for a specific Node position. Returns the 
  //matching expression if found. Returns null otherwise.
  public Expression lookup( final Position key ) {
    for( int i = 0; i < this.array.length; i++) {
      if( this.array[i].getKey().isEqualTo( key ) ) {
        return this.array[i].getValue();
      }
    }
    return null;
  }
}