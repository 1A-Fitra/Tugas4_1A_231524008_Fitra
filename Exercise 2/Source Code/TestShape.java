public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();

        System.out.println(
            "Shape s1: \n"
            + s1.toString()
            + "\n"
        );

        Shape s2 = new Shape("blue", false);

        System.out.println(
            "Shape s2: \n"
            + s2.toString()
        );
    }
}
