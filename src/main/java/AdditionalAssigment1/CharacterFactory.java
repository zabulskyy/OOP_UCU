package AdditionalAssigment1;

import java.util.Random;

public class CharacterFactory {


    static Character createCharacter(){
        Character[] characters = {new Elf(), new King(), new Knight(), new Hobbit()};
        int index = new Random().nextInt(4);
        return characters[index];
    }

}
