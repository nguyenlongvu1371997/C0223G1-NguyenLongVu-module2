package ss10_array_list.excercise.my_list.model;

import ss10_array_list.excercise.my_list.model.Person;

public class Teacher extends Person {
    private String specialize;

    public Teacher(String code, String name, String date, String sex, String specialize) {
        super(code, name, date, sex);
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", date=" + getDate() + '\'' +
                ", sex='" + getSex() + '\'' +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
