public class Stendaanium extends Core {
    public Stendaanium() {
    }

    @Override
    public double split(double temperatureInKelvin, double timeInSeconds) {
        double totalResidualPercentage;
        double totalSteamProduced;
        double totalResidualHeatProduced;

        if (temperatureInKelvin < 335){
            totalResidualPercentage = 100;
        }
        else if (temperatureInKelvin > 447) {
            try {
                throw new MeltdownException("Meltdown");
            } catch (MeltdownException e) {
                throw new RuntimeException(e);
            }
        } else {
            totalResidualPercentage = getResidualPercentage() - ((0.00008 * temperatureInKelvin) * (timeInSeconds * 0.0002));
        }
        totalSteamProduced = 35 * temperatureInKelvin;
        totalResidualHeatProduced = (timeInSeconds / 0.30) * 18;

        setAmountOfSteam(totalSteamProduced);
        setResidualHeat(totalResidualHeatProduced);

        return totalResidualPercentage;
    }
}