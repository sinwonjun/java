package jump2java;

import java.util.Scanner;
import java.util.ArrayList;

class Car {
    String name;
    int year;

    Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    void info() {
        System.out.println("이름: " + name);
        System.out.println("연식: " + year);
    }

    void drive() {
        System.out.println(name + " 달린다.");
    }

    int getAge() {
        return 2026 - year;
    }
}

class ElectricCar extends Car {
    double battery;

    ElectricCar(String name, int year, double battery) {
        super(name, year);
        this.battery = battery;
    }

    void info() {
        super.info();
        System.out.println("배터리: " + battery + "%");
    }

    void drive() {
        System.out.println(name + " 전기로 달린다.");
    }
}

class SportCar extends Car {
    int maxspeed;

    SportCar(String name, int year, int maxspeed) {
        super(name, year);
        this.maxspeed = maxspeed;
    }

    void info() {
        super.info();
        System.out.println("최고속도: " + maxspeed);
    }

    void drive() {
        System.out.println(name + " 고속으로 달린다.");
    }
}

public class T0611A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        while (true) {
            System.out.println("\n=== 차량 등록 시스템 ===");
            System.out.println("1. 전기차 등록");
            System.out.println("2. 스포츠카 등록");
            System.out.println("3. 자동차 조회");
            System.out.println("4. 종료");
            System.out.print("번호 선택: ");

            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1: 
                    System.out.print("이름: ");
                    String eName = sc.nextLine();
                    System.out.print("연식: ");
                    int eYear = sc.nextInt();
                    System.out.print("배터리(%): ");
                    double battery = sc.nextDouble();
                    sc.nextLine(); // 버퍼 제거
                    cars.add(new ElectricCar(eName, eYear, battery));
                    break;

                case 2: 
                    System.out.print("이름: ");
                    String sName = sc.nextLine();
                    System.out.print("연식: ");
                    int sYear = sc.nextInt();
                    System.out.print("최고속도: ");
                    int maxspeed = sc.nextInt();
                    sc.nextLine(); 
                    cars.add(new SportCar(sName, sYear, maxspeed));
                    break;
                case 3: 
                    if(cars.isEmpty()) {
                    	System.out.println("등록된 차 없음.");
                    } else {
                    	for(Car a: cars) {
                    		a.info();
                    		a.drive();
                    		System.out.println("나이: " + a.getAge()+"년");
                    		System.out.println("===================");
                    	}
                    }

                case 4: 
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}