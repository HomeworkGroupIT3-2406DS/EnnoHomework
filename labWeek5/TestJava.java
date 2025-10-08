import java.util.Scanner;

abstract class DataScince {
	String name;
	short age;
	DataScince(String name, short age){
		this.name = name;
		this.age = age;
	}

	abstract void makeSound();

	void eat(){
		System.out.printf("%s, %d\n", name, age);
	}
}

class Scientifi extends DataScince {
	Scientifi(String name, short age){
		super(name, age);
	}

	@Override
	void makeSound(){
		System.out.println("WW");
	}
}

public class TestJava {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DataScince scientifi = new Scientifi(sc.nextLine(), (short)38);
		scientifi.makeSound();
		scientifi.eat();
	}
}
