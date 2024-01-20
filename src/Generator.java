public class Generator {
    Reactor reactor;
    double kwh;
    double steam;

    public Generator(Reactor reactor) {
        this.reactor = reactor;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public double getKwh() {
        return kwh;
    }

    public void setKwh(double kwh) {
        this.kwh = kwh;
    }

    public double getSteam() {
        return steam;
    }

    public void setSteam(double steam) {
        this.steam = steam;
    }

    public double generateEnergy(){
        double heat = getReactor().heat;
        setKwh(heat * 8);
        setSteam(getKwh());
        return getKwh();
    }
}
