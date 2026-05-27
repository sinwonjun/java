package jump2java;

import java.util.Scanner;

class Car {

    String name;
    String color;
    int distance;

    Car(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    int setDistance(int distance) {
        this.distance = distance;
        return this.distance;
    }
}

public class T0521B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();

        System.out.print("색상: ");
        String color = sc.next();

        System.out.print("주행거리: ");
        int dis = sc.nextInt();

        sc.close();

        Car car1 = new Car("씽씽이");
        Car car2 = new Car(name);

        car1.setColor(color);
        car1.setDistance(dis);

        car2.setColor("black");
        car2.setDistance(500);

        System.out.println(car1.name + " 색: " + car1.color);
        System.out.println(car1.name + " 주행거리: " + car1.distance);

        System.out.println(car2.name + " 색: " + car2.color);
        System.out.println(car2.name + " 주행거리: " + car2.distance);
    }
}