package jump2java;

public class S05_03_4 {
    void sum(int a, int b) {
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
    }

    public static void main(String[] args) {
    	S05_03_4 sample = new S05_03_4();
        sample.sum(3, 4);
    }
}


