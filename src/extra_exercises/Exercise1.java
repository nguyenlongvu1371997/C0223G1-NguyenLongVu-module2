package extra_exercises;

public class Exercise1 {
    public int sumPrimes(int[] array) {
        int sum = 0;
        boolean flag;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 2) {
                continue;
            } else {
                flag = false;
                for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                    if (array[i] % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    continue;
                } else {
                    sum += array[i];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13};
        Exercise1 exercise1 = new Exercise1();
        System.out.println(exercise1.sumPrimes(array));
    }
}
