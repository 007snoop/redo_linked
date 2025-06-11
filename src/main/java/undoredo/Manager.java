package undoredo;

public class Manager {
    private Node curr;

    public Manager(String startState) {
        curr = new Node(startState);
    }

    public void addState(String newState) {
        Node newNode = new Node(newState);

        newNode.prev = curr;
        curr.next = null; // clear redo path
        curr.next = newNode;
        curr = newNode;
    }

    public void undo() {
        if (curr.prev != null) {
            curr = curr.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public String getCurr() {
        return curr.state;
    }


    // flair for chainState
    public void Chain() {
        Node temp = curr;
        while (temp.prev != null) {
            temp = temp.prev;
        }

        // current state in [ ]
        System.out.println("State Chain : ");
        while (temp != null) {
            if (temp == curr) {
                System.out.print("[" + temp.state + "]");
            } else {
                System.out.print(temp.state + " -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
