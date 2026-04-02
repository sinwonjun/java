package jump2java;

class Animal5 {   // Animal → Animal5
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog5 extends Animal5 {   // Dog → Dog5, Animal → Animal5
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog5 extends Dog5 {   // HouseDog → HouseDog5, Dog → Dog5
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
}

public class S05_05_4 {
    public static void main(String[] args) {
        HouseDog5 houseDog = new HouseDog5();   // HouseDog → HouseDog5
        houseDog.setName("happy");
        houseDog.sleep();  // HouseDog5에서 오버라이드한 sleep() 호출
    }
}