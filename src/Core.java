public abstract class Core {
    private double residualPercentage;
    private double residualHeat;
    private double amountOfSteam;

    public Core() {
        this.residualPercentage = 100;
    }

    public double getResidualPercentage() {
        return residualPercentage;
    }

    public void setResidualPercentage(double residualPercentage) {
        this.residualPercentage = residualPercentage;
    }

    public double getResidualHeat() {
        return residualHeat;
    }

    public void setResidualHeat(double residualHeat) {
        this.residualHeat = residualHeat;
    }

    public double getAmountOfSteam() {
        return amountOfSteam;
    }

    public void setAmountOfSteam(double amountOfSteam) {
        this.amountOfSteam = amountOfSteam;
    }

    public abstract double split(double temperatureInKelvin, double timeInSeconds);
}
