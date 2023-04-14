package ss10_array_list.excercise.my_list.repository;

import ss10_array_list.excercise.my_list.model.Student;

public interface IStudentList {
    void displayStudentList();

    void addStudent(Student student);

    boolean deleteStudent(String code);
}
