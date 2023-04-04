package ss2_loop_java.exercise;

public class DisplayPrimesSmaller100 {
    public static void main(String[] args) {
        byte prime = 2;
        while (prime < 100) {
            if (prime == 2 || prime == 3) {
                System.out.println(prime);
                prime++;
            } else {
                boolean isPrime = true;
                for (byte i = 2; i <= prime / 2; i++) {
                    if (prime % i == 0) {
                        isPrime = false;
                        prime++;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(prime);
                    prime++;
                }
            }

        }
    }
}
