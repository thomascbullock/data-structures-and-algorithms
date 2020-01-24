package stackandqueue;

public class Queue {

    private Node front;
    private Node back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(String value) {
        Node n = new Node(value);
        if (front == null && back == null) {
            front = n;
            back = n;
        } else {
            back.next = n;
            back = n;

        }

    }

    public String dequeue() {
        String retVal = front.value;
        front = front.next;
        return retVal;
    }

    public String toString(){
        Node current = front;
        String retStr = "";
        while (current != null) {
            if (retStr.equals("")) {
                retStr = current.value;
            } else {
                retStr = retStr + " -> " + current.value;
            }
            current = current.next;
        }
        return retStr;
    }

    public String peek(){
        return front.value;
    }

}
