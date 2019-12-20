package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test public void testNode() {
        Node testNode = new Node("firstValue");
        assertEquals("firstValue", testNode.getValue());
        testNode.setNext(new Node("nextValue"));
        assertEquals("nextValue", testNode.getNext().getValue());
    }
}
