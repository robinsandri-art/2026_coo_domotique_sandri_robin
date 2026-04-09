import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe l : this.lampes) {
            l.allumer();
        }

    }
    public String toString() {
        String r = "";
        for (int i = 0; i < this.lampes.size(); i++) {
            r += i + " " + this.lampes.get(i) + "\n";
        }
        return r;
    }
    public void ajouterHifi(Hifi hifi) {
    this.appareils.add(hifi);
}
}