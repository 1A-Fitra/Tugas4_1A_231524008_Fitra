public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*super.getArea() + 2*Math.PI*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " Height = " + height;
    }

    public double getVolume() {
        return getHeight()*getArea();
    }
}
