package ss10_array_list.excercise.my_list;

public class TeacherService {
    public void addTeacher(String code, String name, String date, String sex, String specialize) {
        MyList.teachers.add(new Teacher(code, name, date, sex, specialize));
    }

    public void deleteTeacher(String code) {
        for (int i = 0; i < MyList.teachers.size(); i++) {
            if (code.equals(MyList.teachers.get(i).getCode())) {
                MyList.teachers.remove(i);
                System.out.println("xóa thành công");
                break;
            }
        }
    }

    public void displayTeacher() {
        System.out.println(MyList.teachers);
    }
}
