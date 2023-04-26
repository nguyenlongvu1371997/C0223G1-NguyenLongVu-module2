package case_study.model.booking;

public class Booking {
    private String codeBooking;
    private String dateBooking;
    private String dateStart;
    private String dateEnd;
    private String codeCustomer;
    private String codeService;

    public Booking() {
    }

    public Booking(String codeBooking, String dateBooking, String dateStart, String dateEnd, String codeCustomer, String codeService) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.codeCustomer = codeCustomer;
        this.codeService = codeService;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                ", codeService='" + codeService + '\'' +
                '}';
    }
}
