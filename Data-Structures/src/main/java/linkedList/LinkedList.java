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
                returnString = returnString + " NULL";
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
            if (c.getValue() == valueToFind) {
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
            if (c.getNext() != null && c.getNext().getValue() == valueBefore) {
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
            if (c.getValue() == valueAfter) {
                Node newNext = new Node(newValue);
                newNext.setNext(c.getNext());
                c.setNext(newNext);
                return;
            }
            c = c.getNext();
        }
    }
}
