package oop;

public class Runner {
    public static void main(String[] args) {
        Iron evgeniiIron = new Iron("White");
        System.out.println(evgeniiIron.getColor());
        evgeniiIron.setColor("Red");
        System.out.println(evgeniiIron.getColor());

    }
}
