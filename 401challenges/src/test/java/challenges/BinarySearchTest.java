package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void testBinarySearch(){
        BinarySearch binarySearch = new BinarySearch();

        int[] arrToSearch = {11,22,33,44,55,66,77};
        int intToFind = 90;

        assertEquals(-1, binarySearch.binarySearch(arrToSearch, intToFind));

    }

}
