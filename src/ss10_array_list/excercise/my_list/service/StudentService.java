package ss10_array_list.excercise.my_list.service;

import ss10_array_list.excercise.my_list.model.Student;
import ss10_array_list.excercise.my_list.repository.StudentList;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner sc = new Scanner(System.in);
    StudentList studentList = new StudentList();

    public void addStudent() {
        System.out.println("nhập lần lượt mã, tên, ngày sinh, giới tính, lớp, điểm cho học viên");
        String code = sc.nextLine();
        String name = sc.nextLine();
        String date = sc.nextLine();
        String sex = sc.nextLine();
        String classes = sc.nextLine();
        Integer score = Integer.parseInt(sc.nextLine());
        studentList.addStudent(new Student(code, name, date, sex, classes, score));
    }

    public void deleteStudent() {
        System.out.println("nhập mã học viên bạn muốn xóa");
        String code = sc.nextLine();
        if (studentList.deleteStudent(code)) {
            System.out.println("xóa thành công");
        } else {
            System.out.println("không tìm thấy mã");
        }

    }

    public void displayStudent() {
        studentList.displayStudentList();
    }
}
