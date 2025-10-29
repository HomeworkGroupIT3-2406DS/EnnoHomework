package labWork6;

//пример абстрактного класса
// подкласс AbstractCat с расширением AbstractPEt
public class AbstractCat extends AbstractPet{
    //реализация метода sound для AbstractCat
    @Override
    public void sound() {
        System.out.println("meow");
    }
}
