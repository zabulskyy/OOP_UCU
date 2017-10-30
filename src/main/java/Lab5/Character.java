package Lab5;

public abstract class Character {
    protected int power;
    protected int hp;

    public abstract void kick(Character c);

    boolean isAlive() {
        return this.hp > 0;
    }
}
