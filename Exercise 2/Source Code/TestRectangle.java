public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(
            "Rectangle r1: "
            + "\nArea = " + r1.getArea()
            + "\n" + r1.toString()
            + "\nPerimeter = " + r1.getPerimeter()
            + "\n"
        );

        Rectangle r2 = new Rectangle(5.0, 15.0);
        System.out.println(
            "Rectangle r2: "
            + "\n" + r2.toString()
            + "\nPerimeter = " + r2.getPerimeter()
            + "\nArea = " + r2.getArea()
            + "\n"
        );

        Rectangle r3 = new Rectangle(19.0, 27.0, "purple", false);
        System.out.println(
            "Rectangle r3: "
            + "\n" + r3.toString()
            + "\nPerimeter = " + r3.getPerimeter()
            + "\nArea = " + r3.getArea()
        );
    }
}
