package jump2java;

class Animal1 {   // 이름 변경
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal1 {   
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

public class S05_05_2 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();   
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}