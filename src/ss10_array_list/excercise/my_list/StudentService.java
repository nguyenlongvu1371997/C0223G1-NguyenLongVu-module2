package ss10_array_list.excercise.my_list;

public class StudentService {

    public void addStudent(String code, String name, String date, String sex, String classes, int score) {
        MyList.students.add(new Student(code, name, date, sex, classes, score));
    }


    public void deleteStudent(String code) {
        for (int i = 0; i < MyList.students.size(); i++) {
            if (code.equals(MyList.students.get(i).getCode())) {
                MyList.students.remove(i);
                System.out.println("xóa thành công");
                break;
            }
        }
    }

    public void displayStudent() {
        System.out.println(MyList.students);
    }
}
