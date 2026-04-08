import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LampeTest {

	public void testLampe() {
		Lampe l = new Lampe("lampe1");

		boolean res = l.isAllume();
		assertFalse(res, "une nouvelle lampe devrait etre eteinte");
	}


	public void testAllumer() {
		Lampe l = new Lampe("lampe1");

		l.allumer();

		boolean res = l.isAllume();
		assertTrue(res, "apres allumer, la lampe devrait etre allumee");
	}

	public void testAllumer_allumee() {
		Lampe l = new Lampe("lampe1");
		l.allumer();

		l.allumer();

		boolean res = l.isAllume();
		assertTrue(res,"apres allumer, la lampe devrait etre allumee");
	}

	public void testeteindre_allumee() {
		Lampe l = new Lampe("lampe1");
		l.allumer();

		l.eteindre();

		boolean res = l.isAllume();
		assertFalse(res,"apres eteindre, la lampe devrait etre eteinte");
	}

	public void testToString_eteinte() {
		Lampe l = new Lampe("lampe1");

		String r=""+l;

		assertEquals("lampe1: Off",r,"affichage devrait etr off");
	}


	public void testToString_allumee() {
		Lampe l = new Lampe("lampe1");
		l.allumer();

		String r=""+l;

		assertEquals("lampe1: On",r,"affichage devrait etr off");

	}

}