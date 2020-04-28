package oop.man;


public class World {
    public static void main(String[] args) {

        Man stepan = new Man("White", "80Kg");
        Man ivan = new Man("Yellow", "60Kg");
        Man viktor = new Man("Black", "100Kg");

        System.out.println("Stepan\n");
        System.out.println("Цвет Stepana: " + stepan.getColor());
        stepan.setColor("Black");
        System.out.println("Цвет Stepana после операции: " + stepan.getColor());

        System.out.println("Вес Stepana: " + stepan.getWeight());
        stepan.setWeight("90Kg");
        System.out.println("Вес Stepana после Burger King: " + stepan.getWeight());

        System.out.println("\nIvan\n");
        System.out.println("Цвет Ivana: " + ivan.getColor());
        ivan.setColor("White");
        System.out.println("Цвет Ivana после душа: " + ivan.getColor());

        System.out.println("Вес Ivana: " + ivan.getWeight());
        ivan.setWeight("58Kg");
        System.out.println("Вес Ivana после пробежки: " + ivan.getWeight());
    }
}