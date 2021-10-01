import java.util.Date;

public class Room {

    private int roomNumber;
    private int floorNumber;
    private int numberOfBeds;
    private double hourlyRent;
    public boolean isAvailable;
    private boolean isReserved;


    public Room() {
        roomNumber= 0;
        floorNumber= 0;
        numberOfBeds =0;
    }
    public Room(Room _room) {
        this.roomNumber = _room.getRoomNumber();
        this.floorNumber = _room.getFloorNumber();
        this.numberOfBeds = _room.getNumberOfBeds();
        this.hourlyRent = _room.getHourlyRent();
        this.isAvailable = _room.isAvailable();
    }
    public Room(int roomNumber, int floorNumber, int numberOfBeds) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.numberOfBeds = numberOfBeds;
    }

    public Room(int roomNumber, int floorNumber, int numberOfBeds, double hourlyRent, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.numberOfBeds = numberOfBeds;
        this.hourlyRent = hourlyRent;
        this.isAvailable = isAvailable;
    }
    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getHourlyRent() {
        return hourlyRent;
    }

    public void setHourlyRent(double hourlyRent) {
        this.hourlyRent = hourlyRent;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

}
