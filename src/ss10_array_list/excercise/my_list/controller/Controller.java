package ss10_array_list.excercise.my_list.controller;

import ss10_array_list.excercise.my_list.service.StudentService;
import ss10_array_list.excercise.my_list.service.TeacherService;

import java.util.Scanner;

public class Controller {
    public Controller() {
    }

    StudentService studentService = new StudentService();
    TeacherService teacherService = new TeacherService();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean out = false;
        System.out.println("1.Thêm mới giảng viên hoặc học viên");
        System.out.println("2.Xóa giảng viên hoặc học viên");
        System.out.println("3.Hiện thị danh sách giảng viên hoặc học viên");
        System.out.println("4.Thoát");
        String select;
        do {
            System.out.println("Chọn chức năng: ");
            select = sc.nextLine();
            switch (select) {
                case "1":
                    System.out.println("bấm \'1\' để thêm học viên, \'2\' để thêm giảng viên");
                    String choose = sc.nextLine();
                    if (choose.equals("1")) {
                        studentService.addStudent();

                    } else if (choose.equals("2")) {
                    teacherService.addTeacher();
                    } else {
                        System.out.println("nhập sai");
                    }
                    break;
                case "2":
                    System.out.println("bấm \'1\' để xóa học viên, \'2\' để xóa giảng viên");
                    String choose1 = sc.nextLine();
                    if (choose1.equals("1")) {
                        studentService.deleteStudent();
                    } else if (choose1.equals("2")) {
                    teacherService.deleteTeacher();
                    }
                    break;
                case "3":
                    System.out.println("bấm \'1\' để hiện thị học viên, \'2\' để hiển thị giảng viên");
                    String choose2 = sc.nextLine();
                    if (choose2.equals("1")) {
                        studentService.displayStudent();
                    } else if (choose2.equals("2")) {
                    teacherService.displayTeacher();
                    }
                    break;
                case "4":
                    out = true;
                    break;
                default:
                    System.out.println("nhập sai");
            }
        } while (out == false);
        System.out.println("đã thoát");
    }

}
