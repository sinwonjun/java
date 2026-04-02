package jump2java;

class Updater1 {   // 클래스 이름 변경
    void update(Counter1 counter) {  // 타입은 이미 Counter1
        counter.count++;
    }
}

class Counter1 {
    int count = 0;
}

public class S05_04_2 {
    public static void main(String[] args) {
        Counter1 myCounter = new Counter1();
        System.out.println("before update:" + myCounter.count);

        Updater1 myUpdater = new Updater1();  // 여기 변경
        myUpdater.update(myCounter);

        System.out.println("after update:" + myCounter.count);
    }
}