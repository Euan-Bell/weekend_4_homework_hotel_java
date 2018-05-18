import enums.ConfrenceType;
import org.junit.Before;
import org.junit.Test;
import room.Confrence;
import room.Confrence;

import static org.junit.Assert.assertEquals;

public class ConfrenceTest {

    Confrence confrence;

    @Before
    public void before(){
        confrence = new Confrence("Confrence Room A", ConfrenceType.LARGE,200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Confrence Room A",confrence.getname());
    }

    @Test
    public void hasType(){
        assertEquals(ConfrenceType.LARGE,confrence.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(20,confrence.getCapacity());
    }


    @Test
    public void canGetRate(){
        assertEquals(200.00,confrence.getRate(), 00.1);
    }

}

