package extra_exercises;

public class Exercise8 {
    public int reverseNumber(int number) {
        int count = 0;
        int numberReversed = 0;
        for (int i = 1; i < number; i = i * 10) {
            count++;
        }
        for (int i = 0; i < count; i++) {
            numberReversed += number / ((int) Math.pow(10, count - i - 1)) * ((int) Math.pow(10, i));
            number -= number / ((int) Math.pow(10, count - i - 1)) * ((int) Math.pow(10, count - i - 1));
        }
        return numberReversed;
    }

    public static void main(String[] args) {
        Exercise8 exercise8 = new Exercise8();
        System.out.println(exercise8.reverseNumber(47125));
    }
}
