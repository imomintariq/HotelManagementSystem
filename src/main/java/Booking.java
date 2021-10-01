import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Booking {
    ArrayList<Room> totalRooms;
    ArrayList<Guest> guestsList;
    ArrayList<Food> availableFoods;
    ArrayList<Service> availableServices;


    public Booking() {
        totalRooms = new ArrayList<Room>();
        guestsList = new ArrayList<Guest>();
        availableFoods = new ArrayList<Food>();
        availableServices = new ArrayList<Service>();
    }

    public Booking(ArrayList<Room> totalRooms, ArrayList<Guest> guestsList, ArrayList<Food> availableFoods, ArrayList<Service> availableServices) {
        this.totalRooms = totalRooms;
        this.guestsList = guestsList;
        this.availableFoods = availableFoods;
        this.availableServices = availableServices;
    }

    public ArrayList<Room> getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(ArrayList<Room> totalRooms) {
        this.totalRooms = totalRooms;
    }

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }

    public void setGuestsList(ArrayList<Guest> guestsList) {
        this.guestsList = guestsList;
    }

    public ArrayList<Food> getAvailableFoods() {
        return availableFoods;
    }

    public void setAvailableFoods(ArrayList<Food> availableFoods) {
        this.availableFoods = availableFoods;
    }

    public ArrayList<Service> getAvailableServices() {
        return availableServices;
    }

    public void setAvailableServices(ArrayList<Service> availableServices) {
        this.availableServices = availableServices;
    }
    public boolean addRoom(int roomNumber, int floorNumber,int numberOfBeds, double hourlyRent, boolean isAvailable){

        for(int i=0; i < totalRooms.size() ; i++){
            if(roomNumber == totalRooms.get(i).getRoomNumber() && floorNumber == totalRooms.get(i).getFloorNumber()){
                System.out.println("Room "+ roomNumber + "on floor "+ floorNumber+ " already exists");
                return false;
            }
        }
        Room newRoom = new Room(roomNumber, floorNumber, numberOfBeds, hourlyRent, isAvailable);
        totalRooms.add(newRoom);
        return true;

    }
    public int generateKey(){
        Random r = new Random();
        int key=r.nextInt(10000000)+89999999;
        for(int i = 0; i < guestsList.size(); i++){
            if(key==guestsList.get(i).getKeyNumber()){
                return generateKey();
            }
        }
        return key;
    }

    public boolean bookRoom(String name, String address, String phone, int roomNumber, int floorNumber){

        if(roomIsAvailable(roomNumber, floorNumber)== true){

            boolean roomIsInitialized = false;

            for(int i = 0; i < totalRooms.size(); i++){
                if(totalRooms.get(i).getRoomNumber()==roomNumber && totalRooms.get(i).getFloorNumber() == floorNumber){
                    totalRooms.get(i).setAvailable(false);
                    Room guestRoom =  new Room(totalRooms.get(i));
                    int key = generateKey();
                    Guest newGuest = new Guest(key, name, address, phone, guestRoom);
                    guestsList.add(newGuest);
                    return true;
                }

            }


        }
        else{
            System.out.println("Room is not Available ");
            return false;
        }

        return false;
    }


    public boolean reserveRoom(String name, String address, String phone, int roomNumber, int floorNumber){

        if(roomIsAvailable(roomNumber, floorNumber)== true){

            boolean roomIsInitialized = false;
            Room guestRoom = null;
            for(int i = 0; i < totalRooms.size(); i++){
                if(totalRooms.get(i).getRoomNumber()==roomNumber && totalRooms.get(i).getFloorNumber() == floorNumber){
                    totalRooms.get(i).setAvailable(false);
                    totalRooms.get(i).setReserved(true);
                    return true;
                }

            }

        }
        else{
            System.out.println("Room is not Available ");
        }
        return false;
    }


    public int getKeyAtIndex(int index){

        return guestsList.get(index).getKeyNumber();
    }
    public boolean roomIsAvailable(int roomNumber,int floorNumber){

        for(int i = 0; i < totalRooms.size(); i++){
            if(totalRooms.get(i).getRoomNumber()==roomNumber && totalRooms.get(i).getFloorNumber() == floorNumber){
                if(totalRooms.get(i).isAvailable == true  && totalRooms.get(i).isReserved() == false){
                    System.out.println("Room is available");
                    return true;
                }
                else{
                    System.out.println("Room is not available");
                    if(totalRooms.get(i).isReserved()== true){
                        System.out.println("Room is reserved");
                    }
                    return false;
                }
            }
        }
        System.out.println("Room Number doesnot exist");
        return false;

        }
    public Guest searchGuest(int key){

        for(int i = 0 ; i < guestsList.size(); i++){
            if(guestsList.get(i).getKeyNumber() == key){
                return guestsList.get(i);
            }
        }
        return null;
        }
    public void getAvailableRooms(){
        System.out.println("Available Room");
        for(int i = 0; i < totalRooms.size(); i++){
            if(totalRooms.get(i).isAvailable()==true){
                System.out.println("Room Number: "+totalRooms.get(i).getRoomNumber());
                System.out.println("Floor Number: "+totalRooms.get(i).getFloorNumber());
                System.out.println("Beds in Room: "+totalRooms.get(i).getNumberOfBeds());
                System.out.println("Hourly Rent: "+totalRooms.get(i).getHourlyRent());

            }
        }
    }


}
