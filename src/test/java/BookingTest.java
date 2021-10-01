import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookingTest {

    private static Booking booking = new Booking();
    @Test
    @Order(1)
    void addRoom() {
        Assert.assertEquals(booking.getTotalRooms().size(), 0);
        booking.addRoom(1,1,2,12.00, true);
        booking.addRoom(2,1,2,12.00, true);
        booking.addRoom(3,1,2,12.00, true);
        Assert.assertEquals(booking.getTotalRooms().size(), 3);
    }

    @Test
    @Order(2)
    void bookRoom() {
        booking.addRoom(1,1,2,12.00, true);
        booking.addRoom(2,1,2,12.00, true);
        booking.addRoom(3,1,2,12.00, true);
        Assert.assertEquals(booking.roomIsAvailable(2, 1), true);
        Assert.assertEquals(booking.bookRoom("Momin", "Soan Gardens", "0310-5446436", 2,1),true);
        Assert.assertEquals(booking.roomIsAvailable(2, 1), false);
    }

    @Test
    @Order(3)
    void reserveRoom() {
        booking.addRoom(1,1,2,12.00, true);
        booking.addRoom(2,1,2,12.00, true);
        booking.addRoom(3,1,2,12.00, true);
        Assert.assertEquals(booking.roomIsAvailable(3, 1), true);
        Assert.assertEquals(booking.reserveRoom("Momin", "Soan Gardens", "0310-5446436", 3,1),true);
        Assert.assertEquals(booking.roomIsAvailable(3, 1), false);
    }

    @Test
    @Order(4)
    void searchGuest() {
        booking.addRoom(1,1,2,12.00, true);
        booking.addRoom(2,1,2,12.00, true);
        booking.addRoom(3,1,2,12.00, true);
        int n = booking.getKeyAtIndex(0);
        Assert.assertEquals(booking.searchGuest(n).getName(),"Momin");



    }

    @Test
    @Order(5)
    void getAvailableRooms() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        String[] args =null;
        booking.getAvailableRooms();

        //System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();

        String expectedOutput = "Available Room\r\nRoom Number: 1\r\nFloor Number: 1\r\nBeds in Room: 2\r\nHourly Rent: 12.0";
        assertEquals(output, expectedOutput);
    }

}