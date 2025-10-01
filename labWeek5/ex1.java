import java.util.Scanner;

abstract class DataScience{
	String name;
	short years;
	DataScience(String name, short years){
		this.name = name;
		this.years = years;
	}

	abstract void makeSound();

	void eat(){
		System.out.printf("%s делает работу, ему %d\n", name, years);
	}
}

class Scientific extends DataScience {
	Scientific(String name, short years){
		super(name, years);
	}

	@Override
	void makeSound() {
		System.out.println("WW");
	}
}

public class ex1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DataScience scientific = new Scientific(sc.nextLine(), (short)42);
		scientific.makeSound();
		scientific.eat();
	}
}
