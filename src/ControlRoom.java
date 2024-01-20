import java.util.ArrayList;

public class ControlRoom extends Plant implements Status{

    public ControlRoom(Reactor reactor, Generator generator, CoolingSystem coolingSystem) {
        super(reactor, generator, coolingSystem);
    }

    public boolean isNuclearReactorStable(){
        return false;
    }

    @Override
    public void getStatus() {

    }
}
