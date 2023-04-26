package case_study.model.facility;

public abstract class Facility {
    String code;
    String name;
    double area;
    double cost;
    int people;
    String rentType;

    public Facility() {
    }

    public Facility(String code, String name, double area, double cost, int people, String rentType) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.people = people;
        this.rentType = rentType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", people=" + people +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
