public abstract class Cores{
    double residualPercentage = 100;
    double temp;
    double steam;
    double heat;
    String materialName;

    public Cores(String materialName, double temp, double steam, double heat) {
        this.temp = temp;
        this.steam = steam;
        this.heat = heat;
        this.materialName = materialName;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public double getResidualPercentage() {
        return residualPercentage;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getSteam() {
        return steam;
    }

    public void setSteam(double steam) {
        this.steam = steam;
    }

    public double getHeat() {
        return heat;
    }

    public void setHeat(double heat) {
        this.heat = heat;
    }
}
