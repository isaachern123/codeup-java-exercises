package shapes;

public class Square extends Quadrilateral
    implements Measurable {

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.side = length;
    }

    @Override
    public void setWidth(int width) {
        this.side = width;
    }
}
