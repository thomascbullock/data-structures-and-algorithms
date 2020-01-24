package linkedList;

public class LinkedList {

    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public String toString(){
        Node current = this.head;
        String returnString = "{" + current.getValue() + "} -> ";

        while (current != null) {
            if (current.getNext() == null) {
                returnString = returnString + "NULL";
            } else {
                returnString = returnString + "{"+ current.getNext().getValue() + "} -> ";
            }
            current = current.getNext();
        }

        return returnString;
    }

    public boolean insert (String value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.setNext(this.head);
            this.head = newNode;
        }
        return true;
    }

    public boolean includes (String valueToFind) {
        Node c = this.head;
        while (c != null) {
            if (c.getValue().equals(valueToFind)) {
                return true;
            }
            c = c.getNext();
        }
        return false;
    }

    public void append (String valueToAppend) {
        Node c = this.head;
        while (c != null) {
            if (c.getNext() == null) {
                Node nodeToAppend = new Node(valueToAppend);
                c.setNext(nodeToAppend);
                return;
            }
            c = c.getNext();
        }

    }

    public void insertBefore (String valueBefore, String newValue) {
        Node c  = this.head;
        while (c != null) {
            if (c.getNext() != null && c.getNext().getValue().equals(valueBefore)) {
                Node newNext = new Node(newValue);
                newNext.setNext(c.getNext());
                c.setNext(newNext);
                return;
            }
            c = c.getNext();
        }
    }

    public void insertAfter (String valueAfter, String newValue) {
        Node c = this.head;
        while (c != null) {
            if (c.getValue().equals(valueAfter)) {
                Node newNext = new Node(newValue);
                newNext.setNext(c.getNext());
                c.setNext(newNext);
                return;
            }
            c = c.getNext();
        }
    }

    public String kthFromTheEnd (int k) {

        Node c = this.head;
        Node kth = this.head;
        int counter;

        if (c.getNext() == null && k == 0) {
            return c.getValue();
        }

        //get current at least k positions from the start
        for (counter = 0; counter < k; counter++) {
            if (c != null) {
                c = c.getNext();
                counter++;
            }
        }

        //walk the two nodes in step together until you hit the end
        while (c != null && c.getNext() != null && kth != null && kth.getNext() != null) {
            kth = kth.getNext();
            c = c.getNext();
        }
        return kth.getValue();
    }

}
