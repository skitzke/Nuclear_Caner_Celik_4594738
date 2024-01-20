public class CoolingSystem {
    double waterTemp = 0;
    Reactor reactor;

    public CoolingSystem(Reactor reactor) {
        this.reactor = reactor;
    }

    public double getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(double waterTemp) {
        this.waterTemp = waterTemp;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public double abductResidualHeat(){
        setWaterTemp(getReactor().getHeat() * 0.4);
        return getWaterTemp();
    }
}
