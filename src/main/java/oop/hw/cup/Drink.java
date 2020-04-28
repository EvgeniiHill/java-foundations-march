package oop.hw.cup;

public class Drink {
    public static void main(String[] args) {

        Cup teaCup = new Cup("Синяя", "200ml");
        Cup coffeeCup = new Cup("Белая", "100ml");
        Cup beerGlass = new Cup("Прозрачный", "500ml");

        System.out.println("Чайная чашка");
        System.out.println("Была " + teaCup.getColor() + " " + teaCup.getVolume());
        teaCup.setColor("Красная");
        teaCup.setVolume("100ml");
        System.out.println("Стала " + teaCup.getColor() + " " + teaCup.getVolume());

        System.out.println("\nКофейная чашка");
        System.out.println("Была " + coffeeCup.getColor() + " " + coffeeCup.getVolume());
        coffeeCup.setColor("Грязная");
        coffeeCup.setVolume("Осколки");
        System.out.println("Стала после скандала: " + coffeeCup.getColor() + " " + coffeeCup.getVolume());

        System.out.println("\nПивной стакан");
        System.out.println("Был " + beerGlass.getColor() + " " + beerGlass.getVolume());
        beerGlass.setColor("Мутный");
        beerGlass.setVolume("450ml");
        System.out.println("Стал " + beerGlass.getColor() + " " + beerGlass.getVolume());
    }
}
