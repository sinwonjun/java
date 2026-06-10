package jump2java;

class Book{
	String title;
	String author;
	int price;
	Boolean borrowCheck; //대출여부
	
    Book(String title,String author,int price){
     this.title = title;
     this.author = author;
     this.price = price;
     borrowCheck =  false; //대출 안 된 상태
    }
    void info() {
    	System.out.println("제목: " + title);
    	System.out.println("저자: " + author);
    	System.out.println("가격: " + price +"원");
    	
    	if (borrowCheck) {
    		System.out.println("대출 중");
    	} else {
    		System.out.println("대출 가능");
    	}
    }
    //대출기능을 가지는 메서드
    //만약에 대출상태 확인해서 대출중이면 "이미 대출중아니면. "출력
    //아니면 책이름과 함께 대출 완료 출력, 대출 상태 변경
    void borrow() {
    	if (borrowCheck) {
    		System.out.println(title + "은 이미 대출 중입니다.");
    	} else {
    		borrowCheck = true; 
    		// borrowCheck = !borrowCheck;
    		System.out.println(title + "대출 완료");
    	}
    }
    
}

//book클래스 상속 받는 Novel 클래스 생성
// genre 변수 추가 
// 생성자에서 기존에서 genre를 추가로 입력 받음 => super 명령어 사용 가능
class Novel extends Book{
	String genre;
	
	Novel(String title, String author, int price, String genre){
	super(title, author, price);
	this.genre = genre;
	borrowCheck = false;
}
}
public class Library {
	public static void main(String[] args) {
		Book[] book = new Book[2];
		book[0] = new Novel("해리포터", "롤링",20000,"판타지");
		
		book[0].info();
		book[0].borrow();
		book[0].borrow();
		
		

	}


}
