package jump2java;

public class S05_03_9 {
    int a;  // 객체변수 a

    void varTest() {
        this.a++;
    }

    public static void main(String[] args) {
    	S05_03_9 sample = new S05_03_9();
        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }
}



