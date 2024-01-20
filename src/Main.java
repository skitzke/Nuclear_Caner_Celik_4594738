public class Main {
    public static void main(String[] args) {
        Reactor reactor = new Reactor(15);
        Generator generator = new Generator(reactor);
        CoolingSystem coolingSystem = new CoolingSystem(reactor);
        System.out.println(coolingSystem.abductResidualHeat());
        System.out.println(generator.generateEnergy());
        reactor.split(10,10);
    }
}
