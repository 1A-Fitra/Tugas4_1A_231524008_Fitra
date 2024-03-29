/**
 * The Circle class models a circle with a radius and color
 */
public class Circle { // Save as "Circle.java"
    // private private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
        this.color = "red";
    }

    /** Construcs a Circle instance with the given radius and color */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return this.radius;
    }

    /** Assign a new value to radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the color */
    public String getColor() {
        return this.color;
    }

    /** Assign a new value to color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the area of a circle instance */
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius = " + radius + " color = " + color + "]";
    }
}
