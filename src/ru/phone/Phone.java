package ru.phone;

import java.util.Random;



    //1. Создайте класс Phone, который содержит переменные number, model и weight.
//2. Создайте три экземпляра этого класса.
//3. Выведите на консоль значения их переменных.
//4. Добавить в класс Phone методы:
// receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
// Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//5. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//7. Добавить конструктор без параметров.
//8. Вызвать из конструктора с тремя параметрами конструктор с двумя.
//9. Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод
    public class Phone {

        String number;
        String model;
        int weight;

        public void receiveCall() {
            String[] names = {"Вася", "Коля", "Марина"};
            Random r = new Random();

            receiveCall(names[r.nextInt(0, names.length)]);
        }

        public void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        public String returnNumber() {
            return number.trim();
        }

        public Phone(String number, String model, int weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone(String number, String model) {
//        this.number = number;
//        this.model = model;
//        this.weight = 200
            this(number, model, 200);
        }

        public Phone() {

        }
    }

