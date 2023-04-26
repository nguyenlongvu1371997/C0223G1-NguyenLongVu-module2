package case_study.model.contract;

public class Contract {
    private String codeContract;
    private String codeBooking;
    private double deposit;
    private double payments;

    public Contract() {
    }

    public Contract(String codeContract, String codeBooking, double deposit, double payments) {
        this.codeContract = codeContract;
        this.codeBooking = codeBooking;
        this.deposit = deposit;
        this.payments = payments;
    }

    public String getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(String codeContract) {
        this.codeContract = codeContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "codeContract='" + codeContract + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", deposit=" + deposit +
                ", payments=" + payments +
                '}';
    }
}
