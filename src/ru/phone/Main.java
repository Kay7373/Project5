package ru.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("111111111", "Samsung", 230);
        Phone phone2 = new Phone("2222222222", "Nokia");
        Phone phone3 = new Phone();

        System.out.println(phone1.model + " " + phone1.number + " " + phone1.weight);
        System.out.println(phone2.model + " " + phone2.number + " " + phone2.weight);
        System.out.println(phone3.model + " " + phone3.number + " " + phone3.weight);

        phone1.weight = 12;
        phone1.number = "9800000000 ";
        System.out.println(phone1.model + " " + phone1.number + " " + phone1.weight);

        phone1.receiveCall();
        phone1.receiveCall("Вася");
        System.out.println(phone1.returnNumber());
    }
}
