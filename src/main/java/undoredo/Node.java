package undoredo;

public class Node {
    String state;
    Node prev;
    Node next;

    public Node(String state) {
        this.state = state;
        this.prev = null;
        this.next = null;
    }
}
