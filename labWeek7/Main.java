// Интерфейс
interface Animal {
    void makeSound();
}

//aбстрактный класс
abstract class Pet implements Animal {
    private String name; //инкапсуляция

    public void setName(String name) {
        this.name = name; // Сетер
    }

    public String getName() {
        return name; //Геттер
    }

    // Абстратный метод
    abstract void play();
}

class Dog extends Pet {
    public void makeSound() {
        System.out.println(getName() + " says woof");
    }

    public void play() {
        System.out.println(getName() + " is playing with ball");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("alfa");
        dog.makeSound();
        dog.play();
    }
}
