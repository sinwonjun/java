package jump2java;
import java.util.Scanner;

class Book {
	String title; //책 제목
	String author; //저자
	int price;   //가격
	boolean borrowCheck;  //대출여부, true => 대출중
	//생성자 수정 => 저자, 가격을 추가로 입력받아서 내부 변수 저장
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		this.borrowCheck = false;
		
		if(borrowCheck == true) {
			System.out.println("대출중");
		}else {
			System.out.println("대출 가능");
		}
	}
	
class Novel extends Book{
	Novel(String title, String author, int price){
		super(title, author, price);
	}
	
}
	
	
	void info() {
		System.out.println("====책 정보====");
		System.out.println("책 제목" + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + price + "원");
	}
}

public class T0528C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목: ");
		String title = sc.next();
		System.out.print("저자: ");
		String author = sc.next();		
		System.out.print("가격 ");
		int price = sc.nextInt();	
		sc.close();
		qhfl no = new qhfl(title, author, price);
		no.info();
		

	}

}
