package jump2java;

class Animal1 {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class S05_02_3 {
    public static void main(String[] args) {
        Animal1 cat = new Animal1();
        cat.setName("boby");  
        System.out.println(cat.name);
    }
}