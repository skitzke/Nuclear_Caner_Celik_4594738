import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoolingSystemTest {
    Reactor reactor = new Reactor(15);
    CoolingSystem coolingSystem = new CoolingSystem(reactor);

    @Test
    void abductResidualHeat() {
        assertEquals(6, coolingSystem.abductResidualHeat());
    }
}