public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();

        System.out.println("Cylinder c1: "
            + "\nRadius = " + c1.getRadius() 
            + "\nHeight = " + c1.getHeight()
            + "\nColor = " + c1.getColor()
            + "\nArea = " + c1.getArea()
            + "\nVolume = " + c1.getVolume()
            + "\n"    
        );

        Cylinder c2 = new Cylinder(10.0);

        System.out.println("Cylinder c2: "
            + "\nRadius = " + c2.getRadius() 
            + "\nHeight = " + c2.getHeight()
            + "\nColor = " + c2.getColor()
            + "\nArea = " + c2.getArea()
            + "\nVolume = " + c2.getVolume()
            + "\n"
        );

        Cylinder c3 = new Cylinder(2.0, 10.0);
    
        System.out.println("Cylinder c3: "
            + "\nRadius = " + c3.getRadius() 
            + "\nHeight = " + c3.getHeight()
            + "\nColor = " + c3.getColor()
            + "\nArea = " + c3.getArea()
            + "\nVolume = " + c3.getVolume()
        );
    }
}
