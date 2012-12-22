package spreadsheet;

class SinglyLinkedList {

  /* Immutable. */
  private class LinkedNode {

    private final Node node;
    private final LinkedNode tail;

    /* Assume node is not null. */
    public LinkedNode(final Node node, final LinkedNode tail) {
      this.node = node;
      this.tail = tail;
    }

    /* Guaranteed not null. */
    public Node getNode() {
      return this.node;
    }

    /* Can be null. */
    public LinkedNode getTail() {
      return this.tail;
    }

  }

  private LinkedNode head;

  public SinglyLinkedList() {
    this.head = null;
  }

  /* Assume key and value not null. */
  public void insert(final Position key, final Expression value) {
    this.head = new LinkedNode(new Node(key, value), this.head);
  }

  /* null if the element is absent. */
  public Expression lookup(final Position key) {
    LinkedNode head = this.head;
    Node node = null;
    while (head != null) {
      node = head.getNode();
      if (node.getKey().isEqualTo(key)) {
        return node.getValue();
      }
    }
    return null;
  }

}
