package Fan;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = getSLOW();
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            System.out.printf("Fan is on, fan speed is %d, radius is %.2f, color is %s", this.speed, this.radius, this.color);
        } else {
            System.out.printf("Fan is off, fan speed is %d, radius is %.2f, color is %s", this.speed, this.radius, this.color);
        }
        return super.toString();
    }

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
