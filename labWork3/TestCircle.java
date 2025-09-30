package labWork3;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1: " + c1);
        System.out.println("Radius: " + c1.getRadius() + ", Area: " + c1.getArea());

        Circle c2 = new Circle(2.5);
        System.out.println("c2: " + c2);
        System.out.println("Radius: " + c2.getRadius() + ", Area: " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println("c3: " + c3);

        c3.setRadius(4.0);
        c3.setColor("green");
        System.out.println("After change c3: " + c3);
        System.out.println("Area of c3: " + c3.getArea());
    }
}
