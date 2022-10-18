import carComponents.ComponentTypes;
import carComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Jimmy500",420.00, 69, 56, 1);
    }

    @Test
    public void getEngineName(){
        assertEquals("Jimmy500", engine.getName());
    }

    @Test
    public void getEngineType(){
        assertEquals(ComponentTypes.ENGINE.getType(1), engine.getEngineType());
    }

    @Test
    public void canGetFuelType(){
        assertEquals("Petrol", engine.getFuelType());
    }
}
