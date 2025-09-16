import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        System.out.println(zoo.zooName + " contient " + zoo.nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String inputName = scanner.nextLine();
        while (inputName.trim().isEmpty()) {
            System.out.print("Réessayez : ");
            inputName = scanner.nextLine();
        }

        System.out.print("Donnez le nombre de cages : ");
        int inputCages = scanner.nextInt();
        while (inputCages <= 0) {
            System.out.print("Réessayez : ");
            inputCages = scanner.nextInt();
        }

        zoo.zooName = inputName;
        zoo.nbrCages = inputCages;

        System.out.println(zoo.zooName + " contient " + zoo.nbrCages + " cages");

        Animal lion = new Animal("Felidae", "Simba", 2, true);
        Animal tiger = new Animal("Felidae", "Bagheera", 5, true);

        Zoo myZoo = new Zoo("Friguia", "Sousse", 30);


        System.out.println(myZoo);
        System.out.println(lion);

        myZoo.displayZoo();

        // il ya erreur : println myZoo affiche une référence mémoire car toString() n’est pas redéfini

        System.out.println(myZoo.toString());
    }
}