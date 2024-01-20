import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StendaaniumTest {

    @Test
    void splitIfTempAbove335() {

        Reactor reactor = new Reactor();
        Stendaanium stendaanium = new Stendaanium();
        Nhlium nhlium = new Nhlium();

        reactor.addCoreToReactor(stendaanium);
        reactor.addCoreToReactor(nhlium);

        assertEquals(99.9999732, stendaanium.split(335, 5));
    }
}