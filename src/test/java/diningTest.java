import enums.DiningType;
import org.junit.Before;
import org.junit.Test;
import room.Dining;

import static org.junit.Assert.assertEquals;

public class diningTest {

    Dining dining;

    @Before
    public void before(){
        dining = new Dining("Seaview Room", DiningType.RESTURANT);
    }

    @Test
    public void hasName(){
        assertEquals("Seaview Room",dining.getName());
    }

    @Test
    public void hasType(){
        assertEquals(DiningType.RESTURANT,dining.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(40,dining.getCapacity());
    }

}
