package jump2java;

public class S05_03_1 {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        S05_03_1 sample = new S05_03_1();
        int c = sample.sum(a, b);

        System.out.println(c);
    }
}


