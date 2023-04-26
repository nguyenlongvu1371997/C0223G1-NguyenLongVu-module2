package case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private byte numberOfFloors;

    public House() {
    }

    public House(String code, String name, double area, double cost, int people, String rentType, String roomStandard, byte numberOfFloors) {
        super(code, name, area, cost, people, rentType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public byte getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(byte numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", people=" + people +
                ", rentType='" + rentType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
