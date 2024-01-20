import java.util.ArrayList;

public class Reactor implements StatusInterface {
    private double totalAmountOfKWHProduced;
    private final ArrayList<Core> cores;

    public Reactor(){
        this.cores = new ArrayList<>();
        this.totalAmountOfKWHProduced = 0.0;
    }

    public void addCoreToReactor(Core core){
        this.cores.add(core);
    }

    public double getTotalAmountOfKWHProduced() {
        return totalAmountOfKWHProduced;
    }

    public void setTotalAmountOfKWHProduced(double totalAmountOfKWHProduced) {
        this.totalAmountOfKWHProduced += totalAmountOfKWHProduced;
    }

//    public double generateEnergy(){
//        double generatedEnergy = getAmountOfSteam() * 8;
//        setTotalAmountOfKWHProduced(generatedEnergy);
//        return  generatedEnergy;
//    }

    @Override
    public void getStatus() {

    }
}
