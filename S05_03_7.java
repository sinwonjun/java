package jump2java;

public class S05_03_7 {
    int varTest(int a) {
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        S05_03_7 sample = new S05_03_7();
        a = sample.varTest(a);
        System.out.println(a);
    }
}


