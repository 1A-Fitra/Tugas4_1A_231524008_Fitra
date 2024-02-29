public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getLength() + ", which is a subclass of " + super.toString();
    }
}