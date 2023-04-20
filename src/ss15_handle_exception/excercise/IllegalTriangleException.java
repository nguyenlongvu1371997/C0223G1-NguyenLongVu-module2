package ss15_handle_exception.excercise;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    IllegalTriangleException(String str) {
        super(str);
    }
}
