import java.util.ArrayList;
import java.util.List;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ex20 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Aruzhan", 20));
        people.add(new Person("Nurdaulet", 18));
        people.add(new Person("Dias", 22));

        people.sort((p1, p2) -> p1.age - p2.age);

        System.out.println("Сортировка по возрасту:");
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }
    }
}
