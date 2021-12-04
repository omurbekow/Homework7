package com.company;

public class Main {

    public static void main(String[] args) {
       Warrior warrior = new Warrior();
       Magic magic = new Magic();
       Madic madic = new Madic();
       Hero[] heroes = new Hero[]{madic, magic, warrior};
        for (int i = 0; i < heroes.length ; i++) {
            heroes[i].applySuperAbility("Ability");

        }
    }
}

