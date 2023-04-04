package ss2_loop_java.exercise;

public class Display20Primes {
    public static void main(String[] args) {
        int count = 0;
        int prime = 2;
        while (count < 20) {
            if (prime == 2 || prime == 3) {
                count++;
                System.out.println(prime);
                prime++;
            } else {
                boolean flag = false;
                for (int i = 2; i <= prime / 2; i++) {
                    if (prime % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    prime++;
                } else {
                    System.out.println(prime);
                    prime++;
                    count++;
                }
            }

        }
    }
}
