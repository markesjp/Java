package Teste;

import Main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for abstract factory.
 */
class AbstractFactoryTest {

    private final App app = new App();

    @Test
    void verifyKingCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final var kingdom = app.getKingdom();

        final var elfKing = kingdom.getKing();
        assertTrue(elfKing instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final var orcKing = kingdom.getKing();
        assertTrue(orcKing instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
    }

    @Test
    void verifyCastleCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final var kingdom = app.getKingdom();

        final var elfCastle = kingdom.getCastle();
        assertTrue(elfCastle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final var orcCastle = kingdom.getCastle();
        assertTrue(orcCastle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
    }

    @Test
    void verifyArmyCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final var kingdom = app.getKingdom();

        final var elfArmy = kingdom.getArmy();
        assertTrue(elfArmy instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final var orcArmy = kingdom.getArmy();
        assertTrue(orcArmy instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
    }

    @Test
    void verifyWizardCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final var kingdom = app.getKingdom();

        final var elfWizard = kingdom.getWizard();
        assertTrue(elfWizard instanceof ElfWizard);
        assertEquals(ElfWizard.DESCRIPTION, elfWizard.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final var orcWizard = kingdom.getWizard();
        assertTrue(orcWizard instanceof OrcWizard);
        assertEquals(OrcWizard.DESCRIPTION, orcWizard.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.HUMAN);
        final var humanWizard = kingdom.getWizard();
        assertTrue(humanWizard instanceof HumanWizard);
        assertEquals(HumanWizard.DESCRIPTION, humanWizard.getDescription());
    }

    @Test
    void verifyElfKingdomCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final var kingdom = app.getKingdom();

        final var king = kingdom.getKing();
        final var castle = kingdom.getCastle();
        final var army = kingdom.getArmy();
        final var wizard = kingdom.getWizard();

        assertTrue(king instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
        assertTrue(wizard instanceof ElfWizard);
        assertEquals(ElfWizard.DESCRIPTION, wizard.getDescription());
    }

    @Test
    void verifyOrcKingdomCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final var kingdom = app.getKingdom();

        final var king = kingdom.getKing();
        final var castle = kingdom.getCastle();
        final var army = kingdom.getArmy();
        final var wizard = kingdom.getWizard();

        assertTrue(king instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
        assertTrue(wizard instanceof OrcWizard);
        assertEquals(OrcWizard.DESCRIPTION, wizard.getDescription());
    }

    @Test
    void verifyHumanKingdomCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.HUMAN);
        final var kingdom = app.getKingdom();

        final var king = kingdom.getKing();
        final var castle = kingdom.getCastle();
        final var army = kingdom.getArmy();
        final var wizard = kingdom.getWizard();

        assertTrue(king instanceof HumanKing);
        assertEquals(HumanKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof HumanCastle);
        assertEquals(HumanCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof HumanArmy);
        assertEquals(HumanArmy.DESCRIPTION, army.getDescription());
        assertTrue(wizard instanceof HumanWizard);
        assertEquals(HumanWizard.DESCRIPTION, wizard.getDescription());
    }
}
