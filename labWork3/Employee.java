package labWork3;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
        this.name = "";
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Метод повышения зарплаты на процент
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary = salary * (1 + percent / 100.0);
        }
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}
