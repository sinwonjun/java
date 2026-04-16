package jump2java;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("양의 정수입력:");
			n = sc.nextInt();
			if (n<=0) {
				System.out.println("다시입력");
			}else {
				break;
			}
		}
		
		
		long result = 1;
		
		for(int i=1; i<=n; i++) {
			result *= i;
		}
		
		System.out.println("결과: " + result);
		sc.close();
		
	}

}
