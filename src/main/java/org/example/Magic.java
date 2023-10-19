package org.example;

public class Magic extends Hero {
    public Magic(int damage, TypesOfSuperAbility typeOfSuperAbility, int health) {
        super(damage, typeOfSuperAbility, health);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Hero Magic used a " + this.getTypeOfSuperAbility().getString());
    }
}
