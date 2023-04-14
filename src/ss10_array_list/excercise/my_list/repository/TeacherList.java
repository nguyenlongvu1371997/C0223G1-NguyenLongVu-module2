package ss10_array_list.excercise.my_list.repository;

import ss10_array_list.excercise.my_list.model.Teacher;

import java.util.ArrayList;

public class TeacherList implements ITeacherList {
    private static ArrayList<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new

                Teacher("GV0001", "Ai đó", "01/01/1999", "nữ", "Gì đó"));
        teachers.add(new

                Teacher("GV0002", "Ai đó2", "02/02/1999", "nữ", "Gì đó2"));
        teachers.add(new

                Teacher("GV0003", "Ai đó3", "03/03/1999", "nữ", "Gì đó3"));
    }

    public void displayTeacherList() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean deleteTeacher(String code) {
        for (Teacher teacher : teachers) {
            if (teacher.getCode().equals(code)) {
                teachers.remove(teacher);
                return true;
            }
        }
        return false;
    }
}
