package org.example;

public class Warrior extends Hero {
    public Warrior(int damage, TypesOfSuperAbility typeOfSuperAbility, int health) {
        super(damage, typeOfSuperAbility, health);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Hero Warrior used a " + this.getTypeOfSuperAbility().getString());
    }
}
