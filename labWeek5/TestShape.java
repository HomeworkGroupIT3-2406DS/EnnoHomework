package labWork4;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double r = input.nextDouble();

        Circle circle = new Circle(r);

        System.out.print("Enter the a side of triangle: ");
        double a = input.nextDouble();
        System.out.print("Enter the b side of triangle: ");
        double b = input.nextDouble();
        System.out.print("Enter the c side of triangle: ");
        double c = input.nextDouble();

        Triangle triangle = new Triangle(a, b, c);

        System.out.println("The area of circle: ", circle.calculateArea());
        System.out.println("The perimeter of circle: ", circle.calculatePerimeter());

        System.out.println("The area of triangle: ", triangle.calculateArea());
        System.out.println("The perimeter of triangle: ", triangle.calculatePerimeter());
    }

}
