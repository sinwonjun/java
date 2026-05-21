package jump2java;
import java.util.Scanner;

class Animals{
	String name;
	int age; 
	
	Animals(String name){
		this.name = name;
	}
	
	Animals(String name, int age){
		this.name = name;
		this.age = age;
	}
	
        void sound() {
		System.out.println(this.name + "멍멍");
	}
        
        void changeName(String name) {
        	this.name = name;
        	System.out.println("빠뀐이름:" + this.name);
        	
        }
}

public class S05212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.close();
		
		/*Animals dog = new Animals(name , age);
		System.out.println(dog.name);
		System.out.println(dog.age);*/
		
		Animals dog = new Animals(name , age);
	    Animals cat = new Animals("야옹", 2);
	    Animals dog1 = new Animals("puppy");
	    System.out.println(dog.name +" "+dog.age);
	    System.out.println(dog1.name +" "+dog1.age);
	    System.out.println(cat.name +" "+cat.age);
	    dog.sound();
	    cat.changeName("고양이");
		
		

	}

}
