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
        assertEquals("{itemThree} -> {itemTwo} -> {itemOne} -> NULL", testListTwo.toString());
    }

    @Test public void testIncludes() {
        LinkedList testListThree = new LinkedList();
        testListThree.insert("itemOne");
        testListThree.insert("itemTwo");
        assertTrue(testListThree.includes("itemOne"));
        assertFalse(testListThree.includes("itemThree"));
    }

    @Test public void testAppend() {
        LinkedList testListFour = new LinkedList();
        //insert goes at the front so I'm putting these two in backward name-wise
        testListFour.insert("itemTwo");
        testListFour.insert("itemOne");
        //append goes at the back
        testListFour.append("itemThree");
        assertEquals("{itemOne} -> {itemTwo} -> {itemThree} -> NULL", testListFour.toString());
    }

    @Test public void testBefore(){
        LinkedList testListFive = new LinkedList();

        testListFive.insert("itemThree");
        testListFive.insert("itemOne");
        testListFive.insertBefore("itemThree", "itemTwo");
        assertEquals("{itemOne} -> {itemTwo} -> {itemThree} -> NULL", testListFive.toString());
    }

    @Test public void testAfter(){
        LinkedList testListSix = new LinkedList();
        testListSix.insert("itemTwo");
        testListSix.insert("itemOne");
        testListSix.insertAfter("itemTwo", "itemThree");
        assertEquals("{itemOne} -> {itemTwo} -> {itemThree} -> NULL", testListSix.toString());
    }

    @Test public void testKth(){
        LinkedList testListSeven = new LinkedList();
        testListSeven.insert("itemFive");
        testListSeven.insert("itemFour");
        testListSeven.insert("itemThree");
        testListSeven.insert("itemTwo");
        testListSeven.insert("itemOne");
        assertEquals("itemFive", testListSeven.kthFromTheEnd(0));
    }

    @Test public void testMerge(){
        LinkedList testListEight = new LinkedList();
        LinkedList testListNine = new LinkedList();

        testListEight.insert("E");
        testListEight.insert("C");
        testListEight.insert("A");
        testListNine.insert("F");
        testListNine.insert("D");
        testListNine.insert("B");
        assertEquals("{A} -> {C} -> {E} -> NULL", testListEight.toString());
    }

}
