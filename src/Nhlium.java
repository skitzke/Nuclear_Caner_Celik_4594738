public class Nhlium extends Core {
    public Nhlium() {
    }

    @Override
    public double split(double temperatureInKelvin, double timeInSeconds) {
        double totalSteamProduced;
        double totalResidualHeatProduced;
        double totalResidualPercentage;

        if (temperatureInKelvin < 303){
            totalSteamProduced = (temperatureInKelvin / 70) * (timeInSeconds * 0.70);
            totalResidualHeatProduced = timeInSeconds * 6;
        }
        else if (timeInSeconds > 58 && temperatureInKelvin > 367) {
            try {
                throw new MeltdownException("Meltdown");
            } catch (MeltdownException e) {
                throw new RuntimeException(e);
            }
        }
        else if (getResidualPercentage() < 0.2) {
            try {
                throw new MeltdownException("Meltdown");
            } catch (MeltdownException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            totalSteamProduced = (0.90 * (temperatureInKelvin * 0.6) / timeInSeconds) * (Math.sqrt(9) * timeInSeconds);
            totalResidualHeatProduced = temperatureInKelvin / 0.8;
        }
        setAmountOfSteam(totalSteamProduced);
        setResidualHeat(totalResidualHeatProduced);

        totalResidualPercentage = getResidualPercentage() - (timeInSeconds * 0.03);
        setResidualPercentage(totalResidualPercentage);

        return totalResidualPercentage;
    }

}
