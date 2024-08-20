package Main;

import Main.Kingdom;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class App implements Runnable {

    private final Kingdom kingdom = new Kingdom();

    public Kingdom getKingdom() {
        return kingdom;
    }

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        LOGGER.info("elf kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
        LOGGER.info(kingdom.getWizard().getDescription());

        LOGGER.info("orc kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
        LOGGER.info(kingdom.getWizard().getDescription());
    }

    /**
     * Creates kingdom.
     * @param kingdomType type of Main.Kingdom
     */
    public void createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
        kingdom.setWizard(kingdomFactory.createWizard());
    }
}
