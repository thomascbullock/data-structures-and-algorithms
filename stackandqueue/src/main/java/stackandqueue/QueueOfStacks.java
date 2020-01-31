package stackandqueue;

public class QueueOfStacks {

    private Stack stack1;
    private Stack stack2;


    QueueOfStacks(){
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }

    public void enqueue(String val) {
        stack1.push(val);
    }

    private void loadDeqStack(){
        if (stack2.peek() == null) {
            while (stack1.peek() != null) {
                String current = stack1.pop();
                stack2.push(current);
            }
        }
    }

    public String dequeue() {
        loadDeqStack();
        return stack2.pop();
    }

    public String peek(){
        loadDeqStack();
        return stack2.peek();
    }
}
