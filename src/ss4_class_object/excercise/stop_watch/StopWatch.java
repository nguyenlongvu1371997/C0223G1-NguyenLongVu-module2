package ss4_class_object.excercise.stop_watch;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    long startTime, endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
    }

    private double getStartTime() {
        return startTime;
    }

    private double getEndTime() {
        return endTime;
    }

    private long getElapsedTime() {
        endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập+ \"bắt đầu\" để bắt đầu tinh giờ");
        String start = sc.nextLine();
        if (start.equals("bắt đầu")) {
            StopWatch st = new StopWatch();
            System.out.println("nhập+ \"kết thúc\" để kết thúc tinh giờ");
            String stop = sc.nextLine();
            if (stop.equals("kết thúc")) {
                System.out.println(st.getElapsedTime());
            }
        }
    }
}
