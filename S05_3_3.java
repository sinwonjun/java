package jump2java;

public class S05_3_3 {
    String say() {
        return "Hi";
    }

    public static void main(String[] args) {
    	S05_3_3 sample = new S05_3_3();
        String a = sample.say();
        System.out.println(a);  // "Hi" 출력
    }
}


