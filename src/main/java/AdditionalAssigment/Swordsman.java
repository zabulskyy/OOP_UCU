package AdditionalAssigment;

import java.util.Random;

abstract public class Swordsman extends Character {

    Swordsman(int minHp, int maxHp, int minPower, int maxPower, String name) {
        super(new Random().nextInt(maxHp - minHp) + minHp, new Random().nextInt(maxPower - minPower) + minPower, name);

    }

    @Override
    protected void kick(Character character) {
        System.out.println(this.name + ": deals " + power + " damage to " + character.name);
        character.hp -= this.power;
    }
}
