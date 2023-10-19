package org.example;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(40, TypesOfSuperAbility.MAGICAL_FREEZING, 200),
                new Medic(0, TypesOfSuperAbility.FAST_TREATMENT, 150, 10),
                new Warrior(50, TypesOfSuperAbility.TORUS_KIK, 230)};
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic)hero).increaseExperience();
            }
        }

    }
}