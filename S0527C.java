package jump2java;

interface Animal{
	void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("멍멍!!");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("야용!!");
	}
}



public class S0527C {
	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();
		
		for(int i=0; i<animals.length; i++)
			animals[i].sound();
	

	
	}

}
