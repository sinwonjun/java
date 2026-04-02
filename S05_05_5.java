package jump2java;

class Animal6 {   // Animal → Animal6
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog6 extends Animal6 {   // Dog → Dog6, Animal → Animal6
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog6 extends Dog6 {   // HouseDog → HouseDog6, Dog → Dog6
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class S05_05_5 {
    public static void main(String[] args) {
        HouseDog6 houseDog = new HouseDog6();   // HouseDog → HouseDog6
        houseDog.setName("happy");
        houseDog.sleep();  // happy zzz in house 출력
        houseDog.sleep(3);  // happy zzz in house for 3 hours 출력
    }
}