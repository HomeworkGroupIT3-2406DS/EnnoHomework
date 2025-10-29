package labWork6;

//пример абстрактного класса
//подкласс AbstractDog с расширением AbstractPet
public class AbstractDog extends AbstractPet{
    @Override
    //реализация метода sound для AbstractDog
    public void sound() {
        System.out.println("woof");
    }
}
