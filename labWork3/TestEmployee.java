package labWork3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1001, 50000);
        System.out.println(e1);
        e1.raiseSalary(10);
        System.out.println("After raise: " + e1);
    }
}
