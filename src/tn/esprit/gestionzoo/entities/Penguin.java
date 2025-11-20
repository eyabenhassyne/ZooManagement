package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    // Constructeur par défaut
    public Penguin() {}

    // Constructeur paramétré
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters";
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println(name + " plonge jusqu’à " + swimmingDepth + " mètres.");
    }

    // Hérite déjà de eatMeat(Food meat) via Aquatic
}