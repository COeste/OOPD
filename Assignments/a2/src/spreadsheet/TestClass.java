package spreadsheet;/*
import spreadsheet.Position;
import spreadsheet.Expression;
import spreadsheet.Node;
import spreadsheet.SinglyLinkedListMap;
import spreadsheet.DynamicArrayMap;*/
import spreadsheet.Spreadsheet;

//Class for testing the assignment.
public class TestClass {

  public TestClass () {
    final Position tempPos1 = new Position( 3, 5 );
    final Position tempPos2 = new Position( 5, 7 );
    final Position tempPos3 = new Position( 7, 9 );
    final Expression tempExp1 = new Expression( "Test1" );
    final Expression tempExp2 = new Expression( "Test2" );
    final Node tempNode1 = new Node( tempPos1, tempExp1 );
    final Node tempNode2 = new Node( tempPos1, tempExp1 );
    final Node tempNode3 = new Node( tempPos2, tempExp2 );
    SinglyLinkedListMap tempLink = new SinglyLinkedListMap();
    DynamicArrayMap tempArr = new DynamicArrayMap();
    Spreadsheet tempSpre = new Spreadsheet();
    
    //Tests for Position
    assert tempPos1.getColumn() == 3;
    assert tempPos1.getRow() == 5;
    //Tests for Expression
    assert tempExp1.toBoolean() == true;
    assert tempExp1.toInt() == 5;
    //Tests for Node
    assert tempNode1.getKey().isEqualTo( tempPos1 );
    assert !tempNode1.getKey().isEqualTo( tempPos2 );
    assert tempNode1.getValue().isEqualTo( tempExp1 );
    assert !tempNode1.getValue().isEqualTo( tempExp2 );
    assert tempNode1.isEqualTo( tempNode2 );
    assert !tempNode1.isEqualTo( tempNode3 );
    //Tests for SinglyLinkedListMap
    assert tempLink.lookup( tempPos1 ) == null;
    tempLink.insert( tempPos1, tempExp1 );
    tempLink.insert( tempNode3 );
    assert tempLink.lookup( tempPos1 ).isEqualTo( tempExp1 );
    assert tempLink.lookup( tempPos2 ).isEqualTo( tempExp2 );
    assert tempLink.lookup( tempPos3 ) == null;
    //Tests for DynamicArrayMap
    assert tempArr.lookup( tempPos1 ) == null;
    tempArr.insert( tempPos1, tempExp1 );
    tempArr.insert( tempNode3 );
    assert tempArr.lookup( tempPos1 ).isEqualTo( tempExp1 );
    assert tempArr.lookup( tempPos2 ).isEqualTo( tempExp2 );
    assert tempArr.lookup( tempPos3 ) == null;
    //Tests for Spreadsheet
    assert tempSpre.get( tempPos1 ) == null;
    tempSpre.set( tempPos1, tempExp1 );
    tempSpre.set( tempNode3 );
    assert tempSpre.get( tempPos1 ).isEqualTo( tempExp1 );
    assert tempSpre.get( tempPos2 ).isEqualTo( tempExp2 );
    assert tempSpre.get( tempPos3 ) == null;
  }
}