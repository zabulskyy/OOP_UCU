package Lab5;

import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        HashMap<Student, ArrayList<Double>> stds = new HashMap<Student, ArrayList<Double>>();
//        Student std1 = new Student(13, "Ivan");
//        Student std2 = new Student(std1);
//
//        stds.put(std1, new ArrayList<Double>());
//        System.out.println(stds.get(std2));

    }
}

class Hobbit extends Character {

    private int power = 0;
    private int hp = 3;

    @Override
    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Que que que");
    }
}

class King extends Character {
    protected int power = 15;
    protected int minPower = 5;

    protected int hp = 10;

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        c.hp -= rand.nextInt(this.power - this.minPower) + this.minPower;
    }
}