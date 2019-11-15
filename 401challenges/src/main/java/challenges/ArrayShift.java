package challenges;

public class ArrayShift {
    public int[] insertShiftArray(int[] arrayToShift, int intToInsert) {

        int[] newArray = new int[arrayToShift.length + 1];

        int midpoint = arrayToShift.length/2;

        newArray[midpoint] = intToInsert;

        for (int i = 0; i < arrayToShift.length; i++) {
            if (i < midpoint) {
                newArray[i] = arrayToShift[i];
            } else {
                newArray[i+1] = arrayToShift[i];
            }
        }
        return newArray;
    }

    public int[] removeShiftArray(int[] arrayToUnshift) {
        int[] newArray = new int[arrayToUnshift.length - 1];

        int midpoint = arrayToUnshift.length / 2;
         for (int i = 0; i < arrayToUnshift.length; i++) {
             if (i < midpoint) {
                 newArray[i] = arrayToUnshift[i];
             } else if (i > midpoint) {
                 newArray[i-1] = arrayToUnshift[i];
             }
         }
        return newArray;
    }

}
