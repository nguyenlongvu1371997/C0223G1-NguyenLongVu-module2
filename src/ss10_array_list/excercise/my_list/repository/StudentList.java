package ss10_array_list.excercise.my_list.repository;

import ss10_array_list.excercise.my_list.model.Student;

import java.util.ArrayList;

public class StudentList implements IStudentList {
    private static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new

                Student("HV0001", "Vũ1", "01/01/2000", "nam", "C0223G1", 10));
        students.add(new

                Student("HV0002", "Vũ2", "02/02/2002", "nam", "C0223G1", 9));
        students.add(new

                Student("HV0003", "Vũ3", "03/03/2001", "nam", "C0223G1", 8));
    }

    public void displayStudentList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean deleteStudent(String code) {
        for (Student student : students) {
            if (student.getCode().equals(code)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
}

