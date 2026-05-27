package jump2java;

import java.util.Scanner;

class Animal {
    String name;
    double weight;
    String color;

    Animal(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }   // ← 이 중괄호가 필요함

    void sound() {
        System.out.println(this.name + "가 운다.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println("멍멍");
    }
}

public class S0527A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();

        Animal dog1 = new Animal(name);
        Dog dog2 = new Dog("퍼피");

        dog1.setColor("red");
        System.out.println(dog1.name + " " + dog1.color);
        dog1.sound();

        dog2.setColor("white");
        System.out.println(dog2.name + " " + dog2.color);
        dog2.sound();
        dog2.bark();

        sc.close();
    }
}