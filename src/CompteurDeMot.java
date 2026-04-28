import java.util.Scanner;

public class CompteurDeMot {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("=== COMPTEUR DE MOTS EN DIRECT ===");
        System.out.println("Saisissez votre texte ci-dessous.");
        System.out.println("(Tapez 'FIN' sur une nouvelle ligne pour terminer et entrer sur le clavier pour voir le résultat)");
        System.out.println("--------------------------------------------------");

        int cumulMots = 0;

        while (clavier.hasNextLine()) {
            String ligne = clavier.nextLine();

            if (ligne.equalsIgnoreCase("FIN")) {
                break;
            }

            // Application de votre logique de comptage
            if (!ligne.trim().isEmpty()) {

                String[] tableauMots = ligne.trim().split("\\s+");
                cumulMots += tableauMots.length;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("ANALYSE TERMINÉE");
        System.out.println("Nombre total de mots saisis : " + cumulMots);
        System.out.println("---------------------------------------");

        clavier.close();
    }
}