package labWork6;

public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        Circle circle = new Circle(5);

        System.out.println("Rectangle's area: " + rectangle.getArea());
        System.out.println("Circle's area: " + circle.getArea());
    }
}
