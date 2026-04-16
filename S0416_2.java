package jump2java;
import java.util.Random;

public class S0416_2 {
	public static void main(String[] args) {
		
	
	Random rand = new Random(); 
	int n1 = rand.nextInt(9); //한자리 양의 정수(1~9)
	int n2 = -1 - rand.nextInt(9); //한자리 음의정수(-1~-9)
	int n3 = 10 + rand.nextInt(90); 
	
	double x1 = rand.nextDouble(); // 0.0 이상 1.0 미만	
	double x2 = rand.nextDouble()*10; 
	double x3 = rand.nextDouble()*2-1;
	
	System.out.printf("%f %f %f", x1, x2, x3);
	


	
}
}
