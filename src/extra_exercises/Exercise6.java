package extra_exercises;

public class Exercise6 {
    public int count1Characters(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        String string = "abcabcdabcde";
        char b = 'b';
        System.out.println("kí tự " + b + " xuất hiện " + exercise6.count1Characters(string, b) + " lần");
    }
}
