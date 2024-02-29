public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(
            "Square s1: "
            + "\n" + s1.toString()
            + "\nPerimeter = " + s1.getPerimeter()
            + "\nArea = " + s1.getArea()
            + "\n"
        );

        Square s2 = new Square(9.0);
        System.out.println(
            "Square s2: "
            + "\n" + s2.toString()
            + "\nPerimeter = " + s2.getPerimeter()
            + "\nArea = " + s2.getArea()
            + "\n"
        );

        Square s3 = new Square(7.0, "turqoise", false);
        System.out.println(
            "Square s3: "
            + "\n" + s3.toString()
            + "\nPerimeter = " + s3.getPerimeter()
            + "\nArea = " + s3.getArea()
            + "\n"
        );
    }
}
