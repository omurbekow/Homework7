package com.company;

public class Warrior extends Hero{
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

    }


    public String superAbilityType(String invisible) {
        return null;

    }

    @Override
    public void applySuperAbility(String superAbilityType) {


    }
}
