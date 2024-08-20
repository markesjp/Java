package Main;

/**
 * Main.HumanWizard.
 */
public class HumanWizard implements Wizard {

    static final String DESCRIPTION = "This is the human wizard!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
