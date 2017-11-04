package AdditionalAssigment1;

abstract class Character {
    protected int power;
    protected int hp;
    protected String name;

    protected abstract void kick(Character character);

    protected boolean isAlive() {
        return this.hp > 0;
    }

    Character(int hp, int power, String name) {
        this.hp = hp;
        this.power = power;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "; power: " + this.power + "; hp: " + (this.isAlive() ? this.hp : 0) + ";";
    }
}