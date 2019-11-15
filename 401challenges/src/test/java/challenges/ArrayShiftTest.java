package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testArrayShift(){
        ArrayShift arrayShift = new ArrayShift();
        int[] startArray = {1, 2, 3, 4, 5};
        int intToAdd = 6;
        int[] expectedResult = {1, 2, 6, 3, 4, 5};
        assertArrayEquals(expectedResult, arrayShift.insertShiftArray(startArray,intToAdd));
    }
    @Test public void testArrayUnshift(){
        ArrayShift arrayShift = new ArrayShift();

        int[] startArray = {1,2,3,4,5,6};
        int[] expectedResult = {1,2,3,5,6};
        assertArrayEquals(expectedResult, arrayShift.removeShiftArray(startArray));
    }

}
