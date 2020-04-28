package oop.hw.car;

import oop.hw.car.Car;

public class HWCar {
    public static void main(String[] args) {

        Car toyota = new Car("3L", "White", "Jeep");
        Car bmw = new Car("2L", "Blue", "Coupe");

        System.out.println("Toyota\n");

        System.out.println("Цвет: " + toyota.getColor());
        toyota.setColor("Red");
        System.out.println("Цвет: " + toyota.getColor());

        System.out.println("Объем двигателя: " + toyota.getEngineVolume());
        toyota.setEngineVolume("4L");
        System.out.println("Объем двигателя: " + toyota.getEngineVolume());

        System.out.println("Кузов: " + toyota.getCarBody());
        toyota.setCarBody("Sedan");
        System.out.println("Кузов: " + toyota.getCarBody());

        System.out.println("\nBMW");

        System.out.println("\nЦвет: " + bmw.getColor());
        bmw.setColor("Black");
        System.out.println("Цвет: " + bmw.getColor());

        System.out.println("Объем двигателя: " + bmw.getEngineVolume());
        bmw.setEngineVolume("5L");
        System.out.println("Объем двигателя: " + bmw.getEngineVolume());

        System.out.println("Кузов: " + bmw.getCarBody());
        bmw.setCarBody("Sportcar");
        System.out.println("Кузов: " + bmw.getCarBody());
    }
}
