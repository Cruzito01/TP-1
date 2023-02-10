import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        volume();
    }
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextFloat();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + division);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur");
        float premierEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float deuxiemeEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir la hauteur");
        float troisièmeEntier = scanner.nextFloat();
        float volume = premierEntier * deuxiemeEntier * troisièmeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + volume);
    }
}
