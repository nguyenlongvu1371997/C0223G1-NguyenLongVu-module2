package case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;

    public Villa() {
    }

    public Villa(String code, String name, double area, double cost, int people, String rentType, String roomStandard, double poolArea) {
        super(code, name, area, cost, people, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", people=" + people +
                ", rentType='" + rentType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                '}';
    }
}
