import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFIle {
    public static void main(String[] args){

        Booking booking = new Booking();
        booking.addRoom(1,1,2,12.00, true);
        booking.addRoom(2,1,2,12.00, true);
        booking.addRoom(3,1,2,12.00, true);
        booking.bookRoom("Momin", "Soan Gardens", "03105446436", 1,1);
        booking.bookRoom("Salar", "F-10", "03101231313", 1,1);
        booking.bookRoom("Hseeb", "Mardan", "03101234556", 1,1);
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for(int i = 0; i < booking.guestsList.size() ; i++)
            {
                myWriter.append(booking.guestsList.get(i).getKeyNumber() + booking.guestsList.get(i).getName() +
                        booking.guestsList.get(i).getAddress() + booking.guestsList.get(i).getPhone()+"\r\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
