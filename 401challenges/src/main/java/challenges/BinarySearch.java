package challenges;

public class BinarySearch {

    public int binarySearch(int[] arrayToSearch, int intToFind) {

        int lowerBound = 0;
        int upperBound = arrayToSearch.length - 1;

        while (lowerBound <= upperBound) {
            int midpoint = (lowerBound + upperBound) / 2;
            if (arrayToSearch[midpoint] < intToFind) {
                lowerBound = midpoint + 1;
            } else if (arrayToSearch[midpoint] > intToFind) {
                upperBound = midpoint - 1;
            } else {
                return midpoint;
            }
        }
        return -1;
    }
}