public class Main {
    public static void main(String[] args) {

        NuclearPlant nuclearPlant = new NuclearPlant();
        Reactor reactor = new Reactor();

        Stendaanium stendaanium = new Stendaanium();
        Nhlium nhlium = new Nhlium();

        reactor.addCoreToReactor(stendaanium);
        reactor.addCoreToReactor(nhlium);

//        System.out.println(nhlium.getResidualPercentage());

        System.out.println(nhlium.getClass().getName() + " Residual Percentage: " + nhlium.split(300, 800));
        System.out.println(stendaanium.getClass().getName() + " Residual Percentage: " + stendaanium.split(336,50));

        System.out.println(nhlium.getClass().getName() + " Amount of Steam: " + nhlium.getAmountOfSteam());
        System.out.println(nhlium.getClass().getName() + " Amount of Residual Heat: " + nhlium.getResidualHeat());

        System.out.println(stendaanium.getClass().getName() + " Amount of Steam: " + stendaanium.getAmountOfSteam());
        System.out.println(stendaanium.getClass().getName() + " Amount of Residual Heat: " + stendaanium.getResidualHeat());

//        System.out.println(nhlium.generateEnergy());
//        System.out.println(stendaanium.generateEnergy());
//
//        nuclearPlant.getTotalEnergyProduced();


    }
}
