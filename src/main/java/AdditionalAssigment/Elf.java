package AdditionalAssigment;

public class Elf extends Character {

    @Override
    protected void kick(Character character) {
        if (character.power < this.power) {
            System.out.println(this.name + ": kills " + character.name);
            character.hp = 0;
        } else {
            System.out.println(this.name + ": reduce " + character.name + "'s power by 1");
            --character.power;
        }
    }


    Elf() {
        super(10, 10, "Elf");
    }
}
