package ru.geekbrains.lesson2.builder;

public class ClassicCarBuilder implements CarBuilder{
    private String chassis;
    private String body;
    private String paint;
    private String interior;

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Установка классического шасси");
        this.chassis = "Класическое шасси";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Установка классического кузова");
        this.body = "Классический кузов";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Установка класической окраски");
        this.paint = "Классическая окраска";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Установка классического интерьера");
        this.interior = "Классический интерьер";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Что-то пошло не так!");
        }
        return null;
    }
}
