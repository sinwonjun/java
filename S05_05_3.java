package jump2java;

class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog3 extends Animal3 {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

class HouseDog3 extends Dog3 {
}

public class S05_05_3 {
    public static void main(String[] args) {
        HouseDog3 houseDog = new HouseDog3();
        houseDog.setName("happy");
        houseDog.sleep();  
    }
}