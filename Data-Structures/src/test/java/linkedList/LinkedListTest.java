package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList testList = new LinkedList();
    @Test public void testList() {

       assertTrue(testList.insert("itemOne"));
    }

    @Test public void testPrintList(){
        testList.insert("itemOne");
        testList.insert("itemTwo");
        testList.insert("itemThree");
        assertEquals("{itemOne} -> {itemTwo} -> {itemThree} ->  NULL", testList.toString());
    }
}
