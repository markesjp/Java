package Main;

/**
 * Main.HumanArmy.
 */
public class HumanArmy implements Army {

    static final String DESCRIPTION = "This is the human army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}