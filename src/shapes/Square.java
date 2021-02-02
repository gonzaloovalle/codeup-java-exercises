package shapes;

public class Square extends Quadrilateral{
    public Square(double l, double w) {
        super(l, w);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
//    public Square(double side){
//        super(side, side);
//    }
//
//    public double getArea(){
//        return length * length;
//    }
//
//    public double getPerimeter(){
//        return 4 * length;
//    }
}
