package com.company;

public class Magic extends Hero {
    private int Health;
    private int Damage;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public void applySuperAbility() {
        System.out.println("Magic применил супер способность CRITICAL DAMAGE");
    }


    public String superAbilityType(String invisible) {
        return null;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {

    }
}
