package jump2java;

class Calculator {
	int result = 0;
			
	int add(int num) {
		result += num;
		return result;
	}
}

public class S05_01_3 {
	public static void main(String[] args) {
		Calculator cal1= new Calculator();
		Calculator cal2= new Calculator();
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));
	}
}


