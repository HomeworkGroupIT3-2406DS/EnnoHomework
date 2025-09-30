package labWork3;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(0, 0, 1, 1, 5, "red");
        System.out.println(b);
        b.move();
        System.out.println("After move: " + b);
        b.move();
        System.out.println("After another move: " + b);
    }
}
