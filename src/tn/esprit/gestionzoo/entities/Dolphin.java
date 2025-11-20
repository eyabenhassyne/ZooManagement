package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    // Constructeur par défaut
    public Dolphin() {}

    // Constructeur paramétré
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed + " km/h";
    }

    @Override
    public void swim() {
        System.out.println(name + " nage à " + swimmingSpeed + " km/h.");
    }

    // Hérite déjà de eatMeat(Food meat) via Aquatic
}