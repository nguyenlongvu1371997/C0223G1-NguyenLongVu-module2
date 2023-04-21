package ss10_array_list.excercise.my_list.model;

import ss10_array_list.excercise.my_list.model.Person;

public class Student extends Person {
    private int score;
    private String classes;

    public Student(String code, String name, String date, String sex, String classes, int score) {
        super(code, name, date, sex);
        this.classes = classes;
        this.score = score;
    }

    public Student() {
    }

    public Student(int parseInt, String s, String s1) {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", date=" + getDate() + '\'' +
                ", sex='" + getSex() + '\'' +
                "score=" + score + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
