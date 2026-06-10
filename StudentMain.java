package jump2java;
import java.util.Scanner;

class Student{
	String name;
	double score;
	
	Student(String name, double score){
		this.name = name;
		this.score = score;
	}
	
	void printInfo() {
		System.out.println(name+", "+score);
	}
	
	String getGrade() {
		if (score >= 90) {
			return "A";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 70) {
			return "C";
		} else if (score >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); //String 입력 받음, 띄어쓰기 까지만
		System.out.print("이름, 점수를 입력하시오");
		//String name = sc.nextLine(); //String 한 줄 입력
		double score = sc.nextDouble(); // double로 입력받음
		Student s1 = new Student(name, score);
		s1.printInfo();
		System.out.println("s1.getGrade()" + "등급입니다");
		sc.close();

	}

}
