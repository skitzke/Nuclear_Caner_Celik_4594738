import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhliumTest {

    @Test
    void split() {

        Reactor reactor = new Reactor();
        Stendaanium stendaanium = new Stendaanium();
        Nhlium nhlium = new Nhlium();

        reactor.addCoreToReactor(stendaanium);
        reactor.addCoreToReactor(nhlium);

        assertEquals(99.85, nhlium.split(10, 5));
    }

}