import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {
    Reactor reactor = new Reactor(15);
    Generator generator = new Generator(reactor);

    @org.junit.jupiter.api.Test
    void generateEnergy() {
        assertEquals(120, generator.generateEnergy());
    }
}