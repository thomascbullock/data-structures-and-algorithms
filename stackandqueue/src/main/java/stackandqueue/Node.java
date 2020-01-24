package stackandqueue;

public class Node {
    protected String value;
    protected Node next;

    public Node (String value) {
        this.value = value;
        this.next = null;
    }

    public void setNext(Node nextNode){
        this.next = nextNode;
    }
}
