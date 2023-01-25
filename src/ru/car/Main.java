package ru.car;

import static ru.car.Car.count;
import static ru.car.Car.countCar;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("type1", 1999);
        Car car2 = new Car("type2", 2012);

        car2.setYear(1900);
        car2.setType("type3");
        car2.setColor("red");

        System.out.println(car1.getType() + " " + car1.getYear() + " " + car1.getColor());
        System.out.println(car2.getType() + " " + car2.getYear() + " " + car2.getColor());

//        car1.startCar();
//        car2.startCar();
        car2.stopCar();

        countCar();

        System.out.println(count);

        System.out.println(car1.started);
        car1.startCar(car1);
        System.out.println(car1.started);
        car1.startCar(car1);
        System.out.println(car1.started);
    }
}
