package se.iths.java21.exercises.oop.basics;

public class Main {

    public static void main(String[] args) {
        One cat = new One(true, true, true);
        One fish = new One(true, false, false);
        System.out.println(cat.isPredator());
        System.out.println(fish.isLandWalker());


        Seven counter = new Seven();
        counter.decrease();
        System.out.println(counter.printValue());
        counter.increase();
        System.out.println(counter.printValue());
        counter.increase();
        System.out.println(counter.printObjects());



    }

}
