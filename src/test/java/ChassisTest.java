import carComponents.ComponentTypes;
import carComponents.Chassis;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {

    Chassis chassis;

    @Before
    public void setUp() throws Exception {
        chassis = new Chassis("Jimmy500",420.00, 69, 1);
    }

    @Test
    public void getChassisName(){
        assertEquals("Jimmy500", chassis.getName());
    }

    @Test
    public void getChassisType(){
        assertEquals(ComponentTypes.CHASSIS.getType(1), chassis.getChassisType());
    }

    @Test
    public void canGetPassengerCapacity(){
        assertEquals(2, chassis.getPassengerCapacity());
    }

}
