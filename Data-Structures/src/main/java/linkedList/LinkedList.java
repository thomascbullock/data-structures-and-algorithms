package linkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList(){
        this.head = null;
    }

    public String toString(){
        String returnString = "";
        Node current = this.tail;
        while (current != null) {
            returnString = "{" + current.getValue() + "} -> " + returnString;
            current = current.getNext();
        }
        return returnString + " NULL";
    }

    public boolean insert (String value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.tail = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.setNext(this.tail);
            this.tail = newNode;
        }
        return true;
    }

    public boolean includes (String valueToFind) {
        Node c = this.tail;
        while (c != null) {
            if (c.getValue() == valueToFind) {
                return true;
            }
            c = c.getNext();
        }
        return false;
    }

}
