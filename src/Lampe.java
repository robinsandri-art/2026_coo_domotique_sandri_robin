public class Lampe {

	private String nom;

	private boolean allume;


	public Lampe(String paramNom) {
		this.allume = false;
		this.nom = paramNom;
	}

	public void allumer() {
		this.allume = true;
	}

	public void eteindre() {
		this.allume = false;
	}

	public String toString() {
		String r = "";
		if (this.allume) {
			r = "On";
		} else {
			r = "Off";
		}
		return (nom + ": " + r);
	}

	public boolean isAllume() {
		return allume;
	}
}