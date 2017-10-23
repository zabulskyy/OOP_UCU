package Lab4;

import java.sql.Time;
import java.util.*;


public class Main {

    final static int AMOUNT = 10000;

    public static void main(String[] args) {

        Random rand = new Random();

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("lol", 10);
        System.out.println(hm.get("lol"));


        ArrayList<Integer> arrl = new ArrayList<Integer>();
        LinkedList<Integer> linl = new LinkedList<Integer>();
        Integer[] intl = new Integer[AMOUNT];


        double time3 = System.nanoTime();
        for (int i = 0; i < AMOUNT; i++) {
            int k = rand.nextInt(1000);
            intl[i] = k;
        }
        System.out.println((System.nanoTime() - time3) / 1000);
        System.out.println("list\n");

        double time1 = System.nanoTime();
//        for (int i = 0; i < AMOUNT; i++) {
//            int k = rand.nextInt(1000);
//            arrl.add(k);
//        }
        Collections.addAll(arrl, intl);
        System.out.println((System.nanoTime() - time1) / 1000);
        System.out.println("ArrayList\n");

        double time2 = System.nanoTime();
//        for (int i = 0; i < AMOUNT; i++) {
//            int k = rand.nextInt(1000);
//            linl.add(k);
//        }
        Collections.addAll(linl, intl);
        System.out.println((System.nanoTime() - time2) / 1000);
        System.out.println("LinkedList\n");
    }
}


