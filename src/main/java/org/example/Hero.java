package org.example;

public abstract class Hero implements HavingSuperAbility {

    private int damage;

    public int getDamage() {
        return damage;
    }

    private TypesOfSuperAbility typeOfSuperAbility;

    public TypesOfSuperAbility getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }

    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Hero(int damage, TypesOfSuperAbility typeOfSuperAbility, int health) {
        this.damage = damage;
        this.typeOfSuperAbility = typeOfSuperAbility;
        this.health = health;
    }
}
