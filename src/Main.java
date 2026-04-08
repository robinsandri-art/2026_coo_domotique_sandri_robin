import java.util.ArrayList;

/**
 * classe qui represente une telecommande pilotant plusieurs lampes
 */
public class Telecommande {

    /**
     * liste des lampes controlees
     */
    private ArrayList<Lampe> lampes;

    /**
     * construit une telecommande vide
     */
    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }

    /**
     * ajoute une lampe a la telecommande
     *
     * @param lampe lampe a ajouter
     */
    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    /**
     * active la lampe a l'indice donne
     *
     * @param indiceLampe indice de la lampe
     */
    public void activerLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).allumer();
    }

    /**
     * desactive la lampe a l'indice donne
     *
     * @param indiceLampe indice de la lampe
     */
    public void desactiverLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).eteindre();
    }

    /**
     * active toutes les lampes
     */
    public void activerTout() {
        for (Lampe l : this.lampes) {
            l.allumer();
        }
    }

    /**
     * retourne la description de la telecommande
     *
     * chaque lampe est precedee de son indice
     */
    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < this.lampes.size(); i++) {
            r += i + " " + this.lampes.get(i) + "\n";
        }
        return r;
    }
}