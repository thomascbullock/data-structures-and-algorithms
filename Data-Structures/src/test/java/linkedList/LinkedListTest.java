package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList testList = new LinkedList();
    @Test public void testList() {
        LinkedList testListOne = new LinkedList();
       assertTrue(testListOne.insert("itemOne"));
    }

    @Test public void testPrintList(){
        LinkedList testListTwo = new LinkedList();
        testListTwo.insert("itemOne");
        testListTwo.insert("itemTwo");
        testListTwo.insert("itemThree");
        assertEquals("{itemOne} -> {itemTwo} -> {itemThree} ->  NULL", testListTwo.toString());
    }

    @Test public void testIncludes() {
        LinkedList testListThree = new LinkedList();
        testListThree.insert("itemOne");
        testListThree.insert("itemTwo");
        assertTrue(testListThree.includes("itemOne"));
        assertFalse(testListThree.includes("itemThree"));
    }
}
