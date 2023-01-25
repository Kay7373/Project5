package ru.car;

//Напишите программу с классом Car.
//- Создайте конструктор класса Car.
//- Создайте атрибуты класса Car — color (цвет), type (тип), year (год).
//- Напишите пять методов:
//    - Первый — запуск автомобиля, при его вызове выводится сообщение «Автомобиль заведен».
//    - Второй — отключение автомобиля — выводит сообщение «Автомобиль заглушен».
//    - Третий — присвоение автомобилю года выпуска.
//    - Четвертый метод — присвоение автомобилю типа.
//    - Пятый — присвоение автомобилю цвета.
public class Car {
    //- Атрибуты класса Car — color (цвет), type (тип), year (год).
    private String color;
    private String type;
    private int year;

    boolean started;
    static int count = 0;

    public String getColor() {
   //     return color.toUpperCase();
          return color;
    }
    //    - Пятый — присвоение автомобилю цвета.
    public void setColor(String color) {
        switch (color) {
            case "red":
            case "green":
                this.color = color;
            default:
                break;
        }
    }

    public String getType() {
        return type;
    }
    //    - Четвертый метод — присвоение автомобилю типа.
    public void setType(String type) {
        this.type = type;
    }

        public int getYear() {
        return year;
    }
    //    - Третий метод — присвоение автомобилю года выпуска.
    public void setYear(int year) {
        this.year = year;
    }

    //- Конструктор класса Car.
    public Car(String type, int year) {
        color = "green";
        this.type = type;
        this.year = year;
        started = false;
        countCar();
    }
    //    - Первый — запуск автомобиля, при его вызове выводится сообщение «Автомобиль заведен».
    public void startCar(Car car) {
        if(car.started) {
            System.out.println("Автомобиль уже заведен");
        } else {
            System.out.println("Автомобиль заведен");
            started = true;
        }
    }
    //    - Второй — отключение автомобиля — выводит сообщение «Автомобиль заглушен».
    public void stopCar() {
        System.out.println("Автомобиль заглушен");
        started = false;
    }

    public static void countCar() {
        count++;
    }
}
