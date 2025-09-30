package labWork3;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.0, 3.5);

        System.out.println(r1 + ", area=" + r1.getArea() + ", perimeter=" + r1.getPerimeter());
        System.out.println(r2 + ", area=" + r2.getArea() + ", perimeter=" + r2.getPerimeter());
    }
}
