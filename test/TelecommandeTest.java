import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {


    public void testAjouterLampe_telecommandeVide() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        // methode testee
        t.ajouterLampe(l);

        // verification
        String res = "" + t;
        assertTrue(res.contains("lampe1"), "la telecommande devrait contenir lampe1");
    }


    public void testAjouterLampe_telecommandeAvecUnElement() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l1);

        t.ajouterLampe(l2);

        // verification
        String res = "" + t;
        assertTrue(res.contains("lampe1"), "la telecommande devrait contenir lampe1");
        assertTrue(res.contains("lampe2"), "la telecommande devrait contenir lampe2");
    }

    public void testActiverLampe_position0() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        t.ajouterLampe(l1);

        // methode testee
        t.activerLampe(0);

        // verification
        assertTrue(l1.isAllume(), "la lampe en position 0 devrait etre allumee");
    }

    public void testActiverLampe_position1() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        t.activerLampe(1);

        assertFalse(l1.isAllume(), "la lampe en position 0 ne devrait pas etre allumee");
        assertTrue(l2.isAllume(), "la lampe en position 1 devrait etre allumee");
    }

    public void testActiverLampe_inexistante() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        t.ajouterLampe(l1);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            t.activerLampe(5);
        }, "activer une lampe inexistante devrait lever une exception");
    }
}