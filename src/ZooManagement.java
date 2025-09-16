import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        System.out.println("Bienvenue dans " + zoo.zooName + " qui contient " + zoo.nbrCages + " cages.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String inputName = scanner.nextLine();
        while (inputName.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne peut pas être vide. Réessayez : ");
            inputName = scanner.nextLine();
        }

        System.out.print("Entrez le nombre de cages : ");
        int inputCages = scanner.nextInt();
        while (inputCages <= 0) {
            System.out.print("Le nombre de cages doit être un entier positif. Réessayez : ");
            inputCages = scanner.nextInt();
        }

        zoo.zooName = inputName;
        zoo.nbrCages = inputCages;

        System.out.println("Mise à jour : Bienvenue dans " + zoo.zooName + " qui contient " + zoo.nbrCages + " cages.");
    }
}

