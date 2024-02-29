public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(
            "Cylinder c1: "
            + "\nradius = " + c1.getRadius()
            + "\nheight = " + c1.getHeight()
            + "\nbase area = " + c1.getArea()
            + "\nvolume = " + c1.getVolume()
        );
        System.out.println(c1.toString() + "\n");

        Cylinder c2 = new Cylinder(10.0);
        System.out.println(
            "Cylinder c2: "
            + "\nradius = " + c2.getRadius()
            + "\nheight = " + c2.getHeight()
            + "\nbase area = " + c2.getArea()
            + "\nvolume = " + c2.getVolume()
        );
        System.out.println(c2.toString() + "\n");

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(
            "Cylinder c3: "
            + "\nradius = " + c3.getRadius()
            + "\nheight = " + c3.getHeight()
            + "\nbase area = " + c3.getArea()
            + "\nvolume = " + c3.getVolume()
        );
        System.out.println(c3.toString());
    }
}
