package ss10_array_list.excercise.my_list;

import java.util.Scanner;

public class RunProgram {
    static StudentService studentService = new StudentService();
    static TeacherService teacherService = new TeacherService();

    public static void main(String[] args) {
        System.out.println("Bấm số để chọn chức năng");
        System.out.println("1.Thêm mới giảng viên hoặc học viên");
        System.out.println("2.Xóa giảng viên hoặc học viên");
        System.out.println("3.Hiện thị danh sách giảng viên hoặc học viên");
        System.out.println("4.Thoát");
        byte select;
        do {
            System.out.println("Chọn chức năng: ");
            Scanner sc = new Scanner(System.in);
            select = Byte.parseByte(sc.nextLine());

            if (select == 1) {
                System.out.println("bấm \'1\' để thêm học viên, \'2\' để thêm giảng viên");
                byte choose = Byte.parseByte(sc.nextLine());
                if (choose == 1) {
                    System.out.println("nhập lần lượt mã, tên, ngày sinh, giới tính, lớp, điểm cho học viên");
                    String code = sc.nextLine();
                    String name = sc.nextLine();
                    String date = sc.nextLine();
                    String sex = sc.nextLine();
                    String classes = sc.nextLine();
                    Integer score = Integer.parseInt(sc.nextLine());
                    studentService.addStudent(code, name, date, sex, classes, score);
                } else if (choose == 2) {
                    System.out.println("nhập lần lượt mã, tên, ngày sinh, giới tính, chuyên môn cho giảng viên");
                    String code = sc.nextLine();
                    String name = sc.nextLine();
                    String date = sc.nextLine();
                    String sex = sc.nextLine();
                    String specialize = sc.nextLine();
                    teacherService.addTeacher(code, name, date, sex, specialize);
                }
            } else if (select == 2) {
                System.out.println("bấm \'1\' để xóa học viên, \'2\' để xóa giảng viên");
                byte choose = Byte.parseByte(sc.nextLine());
                if (choose == 1) {
                    System.out.println("nhập mã học viên bạn muốn xóa");
                    String code = sc.nextLine();
                    studentService.deleteStudent(code);
                } else if (choose == 2) {
                    System.out.println("nhập mã giảng viên bạn muốn xóa");
                    String code = sc.nextLine();
                    teacherService.deleteTeacher(code);
                }
            } else if (select == 3) {
                System.out.println("bấm \'1\' để hiện thị học viên, \'2\' để hiển thị giảng viên");
                byte choose = Byte.parseByte(sc.nextLine());
                if (choose == 1) {
                    studentService.displayStudent();
                } else if (choose == 2) {
                    teacherService.displayTeacher();
                }
            }
        } while (select != 4);
        System.out.println("đã thoát");
    }
}
