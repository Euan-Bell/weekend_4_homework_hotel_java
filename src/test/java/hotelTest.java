import enums.BedroomType;
import org.junit.Before;
import org.junit.Test;
import people.Guest;
import room.Bedroom;

import static org.junit.Assert.assertEquals;


public class hotelTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Dave");
        bedroom = new Bedroom(102, BedroomType.DOUBLE, 90.00);
    }

    @Test
    public void canAddGuest(){
        Bedroom.addCustomer(guest);
        assertEquals(2,bedroom.getCapacity());
    }
}
