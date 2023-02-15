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
        System.out.println("square");
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        System.out.println("square");
        return super.getPerimeter();
    }
}
