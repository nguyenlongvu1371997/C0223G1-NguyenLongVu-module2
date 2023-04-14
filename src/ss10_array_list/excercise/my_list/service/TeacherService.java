package ss10_array_list.excercise.my_list.service;

import ss10_array_list.excercise.my_list.model.Teacher;
import ss10_array_list.excercise.my_list.repository.StudentList;
import ss10_array_list.excercise.my_list.repository.TeacherList;

import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private Scanner sc = new Scanner(System.in);
    TeacherList teacherList = new TeacherList();

    public void addTeacher() {
        System.out.println("nhập lần lượt mã, tên, ngày sinh, giới tính, chuyên môn cho giảng viên");
        String code = sc.nextLine();
        String name = sc.nextLine();
        String date = sc.nextLine();
        String sex = sc.nextLine();
        String specialize = sc.nextLine();
        teacherList.addTeacher(new Teacher(code, name, date, sex, specialize));
    }

    public void deleteTeacher() {
        System.out.println("nhập mã giảng viên bạn muốn xóa");
        String code = sc.nextLine();
        if (teacherList.deleteTeacher(code)) {

            System.out.println("xóa thành công");
        } else {
            System.out.println("không tìm thấy");
        }
    }

    public void displayTeacher() {
        teacherList.displayTeacherList();
    }
}
