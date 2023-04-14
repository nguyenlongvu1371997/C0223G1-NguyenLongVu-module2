package ss10_array_list.excercise.my_list.repository;

import ss10_array_list.excercise.my_list.model.Teacher;

public interface ITeacherList {
    void displayTeacherList();

    void addTeacher(Teacher teacher);

    boolean deleteTeacher(String code);
}
