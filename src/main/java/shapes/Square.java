package shapes;

public class Square extends Rectangle{

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

//    public Square(double length, double width) {
//        super(length, width);
//    }



    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
