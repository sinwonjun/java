package jump2java;

public class S05_03_8 {
    int a;  // 객체변수 a

    void varTest(S05_03_8 sample) {
        sample.a++;
    }

    public static void main(String[] args) {
    	S05_03_8 sample = new S05_03_8();
        sample.a = 1;
        sample.varTest(sample);
        System.out.println(sample.a);
    }
}


