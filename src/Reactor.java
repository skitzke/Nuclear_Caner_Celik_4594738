import java.util.ArrayList;

public class Reactor{
    double heat;
    double residualHeat;
    Cores coress;

    public Reactor(double heat) {
        this.heat = heat;
    }

    public double getHeat() {
        return heat;
    }

    public Cores getCoress() {
        return coress;
    }

    public void split(double temperature, int timeInSeconds){
        double nhliumRP = 100;
        double decreasedResidualPercentage = 0.03*timeInSeconds;
        double newNhliumRP = nhliumRP - decreasedResidualPercentage;
        System.out.println(newNhliumRP + "%");
    }
}
