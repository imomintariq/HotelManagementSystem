import java.util.Date;

public class Service {
    private String typeOfService;
    private double serviceCharges;
    Date dateOfService;

    public Service() {
        typeOfService ="";
        serviceCharges = 0;
        dateOfService = new Date();
    }

    public Service(String typeOfService, double serviceCharges, Date dateOfService) {
        this.typeOfService = typeOfService;
        this.serviceCharges = serviceCharges;
        this.dateOfService = dateOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public Date getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(Date dateOfService) {
        this.dateOfService = dateOfService;
    }
}
