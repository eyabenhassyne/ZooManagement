import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        System.out.println(zoo.zooName + "contient " + zoo.nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String inputName = scanner.nextLine();
        while (inputName.trim().isEmpty()) {
            System.out.print("reessayer");
            inputName = scanner.nextLine();
        }

        System.out.print("donner nbre de cages: ");
        int inputCages = scanner.nextInt();
        while (inputCages <= 0) {
            System.out.print("Réessayez : ");
            inputCages = scanner.nextInt();
        }

        zoo.zooName = inputName;
        zoo.nbrCages = inputCages;

        System.out.println( zoo.zooName + "contient " + zoo.nbrCages + " cages");
    }
}

