package labWork3;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle sc1 = new SimpleCircle();
        SimpleCircle sc2 = new SimpleCircle(2.0);
        System.out.println(sc1 + " area=" + sc1.getArea());
        System.out.println(sc2 + " area=" + sc2.getArea());
    }
}
