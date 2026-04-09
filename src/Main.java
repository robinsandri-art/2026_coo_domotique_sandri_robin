import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Telecommande t = new Telecommande();

        ajouterAppareils(t);

        t.activer(1);
        t.activer(3);
        System.out.println(t);

        lancerMenu(t);
    }

    private static void lancerMenu(Telecommande t) {
        System.out.println(t);
        Scanner sc = new Scanner(System.in);

        boolean fini = false;

        while (!fini) {
            System.out.println("entrer le numero de l'appareil");
            int choix = sc.nextInt();
            System.out.println("entrer commande (+/-/exit)");
            String com = sc.nextLine();
            com = sc.nextLine();

            if (com.equals("+")) {
                System.out.println("== activer " + choix + " ==");
                t.activer(choix);
            } else if (com.equals("-")) {
                System.out.println("== desactiver " + choix + " ==");
                t.desactiver(choix);
            } else if (com.equals("exit")) {
                System.out.println("== Fin du programme == ");
                fini = true;
            } else {
                System.out.println("commande inconnue");
            }

            System.out.println(t);
        }
        sc.close();
    }

    private static void ajouterAppareils(Telecommande t) {
        Lampe l1 = new Lampe("Lampe1");
        t.ajouterAppareil(l1);

        Lampe l2 = new Lampe("Lampe2");
        t.ajouterAppareil(l2);

        Hifi h1 = new Hifi();
        t.ajouterAppareil(h1);

        Lampe l3 = new Lampe("Lampe3");
        t.ajouterAppareil(l3);
    }
}