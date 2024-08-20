package Main;

/**
 * Main.HumanKingdomFactory concrete factory.
 */
public class HumanKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new HumanCastle();
    }

    @Override
    public King createKing() {
        return new HumanKing();
    }

    @Override
    public Army createArmy() {
        return new HumanArmy();
    }

    @Override
    public Wizard createWizard() {
        return new HumanWizard();
    }
}