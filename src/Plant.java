public class Plant {
    Reactor reactor;
    Generator generator;
    CoolingSystem coolingSystem;

    public Plant(Reactor reactor, Generator generator, CoolingSystem coolingSystem) {
        this.reactor = reactor;
        this.generator = generator;
        this.coolingSystem = coolingSystem;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public Generator getGenerator() {
        return generator;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public void run(double temp, double time){

    }
}
