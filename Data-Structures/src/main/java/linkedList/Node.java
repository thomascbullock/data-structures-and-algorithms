package linkedList;

public class Node {
    private String value;
    private Node next;

    public Node (String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode){
        this.next = nextNode;
    }
}
