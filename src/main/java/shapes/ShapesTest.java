package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);
        System.out.println("area: " + box1.getArea());
        System.out.println("perimeter: " + box1.getPerimeter());
        System.out.println("area: " + box2.getArea());
        System.out.println("perimeter: " + box2.getPerimeter());
        System.out.println("all done");




    }

}
