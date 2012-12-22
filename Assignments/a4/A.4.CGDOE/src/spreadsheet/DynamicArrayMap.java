package spreadsheet;

final class DynamicArrayMap {

  private Node[] nodes;
  private int length;

  public DynamicArrayMap() {
    this.nodes = new Node[10];
    this.length = 0;
  }

  /**
   * @param key not null.
   * @param value not null.
   */
  public void insert(final Position key, final Expression value) {
    this.expandIfFull();
    this.nodes[this.length] = new Node(key, value);
    this.length++;
  }

  private void expandIfFull() {
    final int capacity = this.nodes.length;
    if (this.length < capacity) {
      return;
    }

    final Node[] newNodes = new Node[capacity * 2];
    System.arraycopy(this.nodes, 0, newNodes, 0, capacity);
    this.nodes = newNodes;
  }

  /**
   * @param key not null.
   * @return null, if the element is absent.
   */
  public Expression lookup(final Position key) {
    Node node = null;
    for (int i = 0; i < this.length; i++) {
      node = this.nodes[i];
      if (node.getKey().isEqualTo(key)) {
        return node.getValue();
      }
    }
    return null;
  }

}
