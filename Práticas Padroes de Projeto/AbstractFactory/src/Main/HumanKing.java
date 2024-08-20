package Main;

/**
 * Main.HumanKing.
 */
public class HumanKing implements King {

    static final String DESCRIPTION = "This is the human king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}