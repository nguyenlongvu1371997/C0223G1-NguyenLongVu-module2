package extra_exercises;

public class Exercise9 {
    public int findIndexSecondBiggestNumber(int[] array) {
        int biggestNumber = array[0];
        int indexOfSecondBiggestNumber = -1;
        for (int i = 1; i < array.length; i++) {
            if (biggestNumber < array[i]) {
                biggestNumber = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (biggestNumber > array[i]) {
                indexOfSecondBiggestNumber = i;
                break;
            }
        }
        if (indexOfSecondBiggestNumber == -1) {
            return -1;
        }
        for (int i = indexOfSecondBiggestNumber + 1; i < array.length; i++) {
            if (array[indexOfSecondBiggestNumber] < array[i] && array[i] < biggestNumber) {
                indexOfSecondBiggestNumber = i;
            }
        }

        return indexOfSecondBiggestNumber;
    }

    public static void main(String[] args) {
        Exercise9 exercise9 = new Exercise9();
        int[] array = {7, 7, 7, 7, 7, 6, 7, 7};
        int index = exercise9.findIndexSecondBiggestNumber(array);
        if (index == -1) {
            System.out.println("không tồn tại số lớn thứ nhì");
        } else {
            System.out.println("số lớn thứ nhỉ là: " + array[index]);
        }
    }
}
