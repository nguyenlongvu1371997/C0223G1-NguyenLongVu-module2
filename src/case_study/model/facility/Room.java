package case_study.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String code, String name, double area, double cost, int people, String rentType, String freeService) {
        super(code, name, area, cost, people, rentType);
        this.freeService = freeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", people=" + people +
                ", rentType='" + rentType + '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
