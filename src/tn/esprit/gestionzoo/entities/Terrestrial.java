package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    // Constructeur par défaut
    public Terrestrial() {}

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }

    // Implémentation des méthodes de Omnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " mange de la viande.");
        } else {
            System.out.println(name + " ne mange pas que des plantes !");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " mange des plantes.");
        } else {
            System.out.println(name + " ne mange pas que de la viande !");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " mange de tout !");
        } else {
            System.out.println(name + " a besoin d’un régime mixte !");
        }
    }
}