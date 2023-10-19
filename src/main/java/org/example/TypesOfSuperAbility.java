package org.example;

public enum TypesOfSuperAbility {
    TORUS_KIK("Torus kik"),
    MAGICAL_FREEZING("Magical freezing"),
    FAST_TREATMENT("Fast treatment");

    private String text;

    TypesOfSuperAbility(String text) {
        this.text = text;
    }

    public String getString() {
        return text;
    }

}
