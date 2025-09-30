package labWork3;

public class Ball {
    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;
    private double radius;
    private String color;

    public Ball() {
        this.x = 0;
        this.y = 0;
        this.xSpeed = 0;
        this.ySpeed = 0;
        this.radius = 1.0;
        this.color = "white";
    }

    public Ball(double x, double y) {
        this();
        this.x = x;
        this.y = y;
    }

    public Ball(double x, double y, double xSpeed, double ySpeed) {
        this(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Ball(double x, double y, double xSpeed, double ySpeed, double radius, String color) {
        this(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.color = color;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getXSpeed() { return xSpeed; }
    public double getYSpeed() { return ySpeed; }
    public double getRadius() { return radius; }
    public String getColor() { return color; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setXSpeed(double xSpeed) { this.xSpeed = xSpeed; }
    public void setYSpeed(double ySpeed) { this.ySpeed = ySpeed; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "x=" + x + ", y=" + y +
                ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed +
                ", radius=" + radius + ", color=" + color +
                "]";
    }
}
