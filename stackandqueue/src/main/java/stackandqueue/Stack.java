package stackandqueue;

public class Stack {

    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push (String value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop () {
        String retVal = top.value;
        top = top.next;
        return retVal;
    }

    public String toString(){
        Node current = top;
        if (top == null) {
            return "";
        }
        String retStr = "";

        while (current != null) {
            if (retStr.equals("")) {
                retStr = current.value;
            } else {
                retStr = current.value + " -> " + retStr;
            }
            current = current.next;
        }
        return retStr;
    }


}
