import enums.BedroomType;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.Bedroom;

import static org.junit.Assert.assertEquals;

public class bedroomTest {

    Bedroom bedroom;
    
    @Before
    public void before(){
        bedroom = new Bedroom(101, BedroomType.DOUBLE,90.00);
    }

    @Test
    public void canGetNumber(){
        assertEquals(101,bedroom.getNumber());
    }

    @Test
    public void hasType(){
        assertEquals(BedroomType.DOUBLE,bedroom.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2,bedroom.getCapacity());
    }


    @Test
    public void canGetRate(){
        assertEquals(90.00,bedroom.getRate(), 00.1);
    }

}



