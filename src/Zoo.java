public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public Zoo() {
        this.animals = new Animal[25];
    }

    public void displayZoo() {
        System.out.println("Nom zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre cages : " + nbrCages); // correction ici : "Nombrecages" → "Nombre cages"
    }

    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }
}