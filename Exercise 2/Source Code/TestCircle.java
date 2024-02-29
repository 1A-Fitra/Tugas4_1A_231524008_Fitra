public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(
            "Circle c1: "
            + "\n" + c1.toString()
            + "\nArea = " + c1.getArea()
            + "\nPerimeter = " + c1.getPerimeter()
            + "\n"
        );

        Circle c2 = new Circle(10.0);
        System.out.println(
            "Circle c2: "
            + "\n" + c2.toString()
            + "\nPerimeter = " + c2.getPerimeter()
            + "\nArea = " + c2.getArea()
            + "\n"
        );

        Circle c3 = new Circle(15.0, "magenta", false);
        System.out.println(
            "Circle c3: "
            + "\n" + c3.toString()
            + "\nPerimeter = " + c3.getPerimeter()
            + "\nArea = " + c3.getArea()
            + "\n"
        );
    }
}
