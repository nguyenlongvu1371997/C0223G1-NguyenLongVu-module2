package ss19_string_regex.exercise;

public class CheckClassName {
    public boolean checkClassName(String className) {
        String PATTERN = "^(C|A|P)+\\d{4}+(G|H|I|K)$";
        return className.matches(PATTERN);
    }

    public static void main(String[] args) {
        CheckClassName checkClassName = new CheckClassName();
        String string = "C1223I";
        System.out.println(checkClassName.checkClassName(string));
    }
}
