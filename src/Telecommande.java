import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil appareil) {
        this.appareils.add(appareil);
    }

    public void activer(int indice) {
        this.appareils.get(indice).allumer();
    }

    public void desactiver(int indice) {
        this.appareils.get(indice).eteindre();
    }

    public void activerTout() {
        for (Appareil a : this.appareils) {
            a.allumer();
        }
    }

    public String toString() {
        String r = "";
        for (int i = 0; i < this.appareils.size(); i++) {
            r += i + " " + this.appareils.get(i) + "\n";
        }
        return r;
    }
}