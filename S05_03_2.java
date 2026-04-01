package jump2java;

public class S05_03_2 {
    int sum(int a, int b) {  // a, b 는 매개변수
        return a+b;
    }

    public static void main(String[] args) {
    	S05_03_2 sample = new S05_03_2();
        int c = sample.sum(3, 4);  // 3, 4는 인수

        System.out.println(c);
    }
}


