package spreadsheet;

/* Immutable */
final class Node {

  private final Position key;
  private final Expression value;

  /* Assume key and value not null. */
  public Node(
      final Position key,
      final Expression value) {
    this.key = key;
    this.value = value;
  }

  /* Guaranteed not null. */
  public Position getKey() {
    return this.key;
  }

  /* Guaranteed not null. */
  public Expression getValue() {
    return this.value;
  }

}
