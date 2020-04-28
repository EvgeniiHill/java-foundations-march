package oop.hw.cow;

public class Lawn {
    public static void main(String[] args) {
        Cow murka = new Cow("Голштинская", "Молочная");
        Cow jurka = new Cow("Симментальская", "Коричневая");

        System.out.println("Корова Мурка");
        System.out.println("Была " + murka.getColor());
        murka.setColor("Черная");
        System.out.println("Стала " + murka.getColor());

        System.out.println("Корова Журка");
        System.out.println("Была " + jurka.getNameBreed());
        jurka.setNameBreed("Буренка");
        System.out.println("Стала " + jurka.getNameBreed());
    }
}
