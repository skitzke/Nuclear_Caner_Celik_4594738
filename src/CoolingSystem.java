public class CoolingSystem {
    private double waterTemperature;

    public CoolingSystem() {
        this.waterTemperature = 0.0;
    }

    public void abductResidualHeat(double residualHeat){
        this.waterTemperature = residualHeat * 0.4;
    }

}
