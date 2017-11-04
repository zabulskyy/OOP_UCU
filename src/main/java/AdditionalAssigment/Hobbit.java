package AdditionalAssigment;

public class Hobbit extends Character {

    int hp = 3;
    int power = 0;

    @Override
    protected void kick(Character character) {
        System.out.println(this.name + ": Qua qua qua");
    }

    public Hobbit() {
        super(3, 0, "Hobbit");
    }

}
