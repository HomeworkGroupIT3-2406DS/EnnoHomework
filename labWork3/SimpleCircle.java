package labWork3;

public class SimpleCircle {
    private double radius;

    public SimpleCircle() {
        this.radius = 1.0;
    }

    public SimpleCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "SimpleCircle[radius=" + radius + "]";
    }
}
