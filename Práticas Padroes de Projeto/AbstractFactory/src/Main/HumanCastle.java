package Main;

/**
 * Main.HumanCastle.
 */
public class HumanCastle implements Castle {

    static final String DESCRIPTION = "This is the human castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}