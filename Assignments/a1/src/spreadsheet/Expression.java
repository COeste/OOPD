package spreadsheet;

//Stores an expression of a position in a spreadsheet
public class Expression {

  private String storage;
  
  //Constructor
  public Expression( final String value ) {
    storage = value;
  }
  
  public boolean toBoolean() {
    return storage.length() > 0;
  }
  
  public int toInt() {
    return storage.length();
  }

}