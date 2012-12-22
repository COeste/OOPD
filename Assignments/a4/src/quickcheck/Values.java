package quickcheck;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import quickcheck.Generator;

public class Values<T> implements Iterable<T>{

  private Iterator<T> vals;
  
  public Values( Generator<T> gen ) {
    ArrayList<T> temp = new ArrayList<T>();
    for( int i = 0; i < 10; i++ ) {
      temp.add( gen.next() );
    }
    vals = temp.iterator();
  }
  
  public Iterator<T> iterator() {
    return this.vals;
  }

}