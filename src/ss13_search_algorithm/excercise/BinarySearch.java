package ss13_search_algorithm.excercise;

public class BinarySearch {
    public int binarySearch(int[] array, int x) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (x == array[midIndex]) {
                return midIndex;
            } else if (x > array[midIndex]) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 5, 7, 12, 41, 55, 100, 101};
        System.out.println(binarySearch.binarySearch(array, 1));
    }
}
