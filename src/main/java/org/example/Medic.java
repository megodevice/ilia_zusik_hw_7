package org.example;

public class Medic extends Hero {

    private int healPoints;

    public Medic(int damage, TypesOfSuperAbility typeOfSuperAbility, int health, int healPoints) {
        super(damage, typeOfSuperAbility, health);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void increaseExperience() {
        this.healPoints += this.healPoints / 10;
        System.out.println("Medic has get experience!");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Hero Medic used a " + this.getTypeOfSuperAbility().getString());
    }
}
