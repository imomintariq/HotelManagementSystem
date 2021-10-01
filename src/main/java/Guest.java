import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Guest {
    private int keyNumber;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Room> roomsBooked;
    private Date checkingInDate;
    private Date checkingOutDate;
    private ArrayList<Service> servicesAvailed;
    private ArrayList<Food> foodOrdered;


    public int getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(int keyNumber) {
        this.keyNumber = keyNumber;
    }

    public Guest() {
        name ="";
        address = "";
        phone ="";
        roomsBooked = new ArrayList<Room>();
        checkingInDate = new Date();
        checkingOutDate = new Date();
        servicesAvailed = new ArrayList<Service>();
        foodOrdered = new ArrayList<Food>();

    }

    public Guest(int key, String name, String address, String phone, Room roomsBooked) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.roomsBooked = new ArrayList<Room>();
        //roomsBooked = new ArrayList<Room>();
        this.roomsBooked.add(roomsBooked);
        this.checkingInDate = new Date();
        this.keyNumber = key;

    }
    public Guest(String name, String address, String phone, ArrayList<Room> roomsBooked, Date checkingInDate, Date checkingOutDate, ArrayList<Service> servicesAvailed, ArrayList<Food> foodOrdered) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.roomsBooked = roomsBooked;
        this.checkingInDate = checkingInDate;
        this.checkingOutDate = checkingOutDate;
        this.servicesAvailed = servicesAvailed;
        this.foodOrdered = foodOrdered;
    }

    public void addRooms( Room roomsBooked){
        this.roomsBooked.add(roomsBooked);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Room> getRoomsBooked() {
        return roomsBooked;
    }

    public void setRoomsBooked(ArrayList<Room> roomsBooked) {
        this.roomsBooked = roomsBooked;
    }

    public Date getCheckingInDate() {
        return checkingInDate;
    }

    public void setCheckingInDate(Date checkingInDate) {
        this.checkingInDate = checkingInDate;
    }

    public Date getCheckingOutDate() {
        return checkingOutDate;
    }

    public void setCheckingOutDate(Date checkingOutDate) {
        this.checkingOutDate = checkingOutDate;
    }

    public ArrayList<Service> getServicesAvailed() {
        return servicesAvailed;
    }

    public void setServicesAvailed(ArrayList<Service> servicesAvailed) {
        this.servicesAvailed = servicesAvailed;
    }

    public ArrayList<Food> getFoodOrdered() {
        return foodOrdered;
    }

    public void setFoodOrdered(ArrayList<Food> foodOrdered) {
        this.foodOrdered = foodOrdered;
    }
}
