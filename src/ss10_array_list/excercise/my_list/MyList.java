package ss10_array_list.excercise.my_list;

import java.util.ArrayList;
import java.util.Scanner;

public class MyList {
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    static {
        students.add(new

                Student("HV0001", "Vũ1", "01/01/2000", "nam", "C0223G1", 10));
        students.add(new

                Student("HV0002", "Vũ2", "02/02/2002", "nam", "C0223G1", 9));
        students.add(new

                Student("HV0003", "Vũ3", "03/03/2001", "nam", "C0223G1", 8));
        teachers.add(new

                Teacher("GV0001", "Ai đó", "01/01/1999", "nữ", "Gì đó"));
        teachers.add(new

                Teacher("GV0002", "Ai đó2", "02/02/1999", "nữ", "Gì đó2"));
        teachers.add(new

                Teacher("GV0003", "Ai đó3", "03/03/1999", "nữ", "Gì đó3"));
    }
}

