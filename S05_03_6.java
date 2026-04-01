package jump2java;

public class S05_03_6 {
    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
    	S05_03_6 sample = new S05_03_6();
        sample.sayNick("야호");
        sample.sayNick("바보");  // 출력되지 않는다.
    }
}


