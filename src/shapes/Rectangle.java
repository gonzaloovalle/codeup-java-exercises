package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double l, double w) {
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
//    protected double length;
//    protected double width;
//
//    public Rectangle(double l, double w){
//        this.length = l;
//        this.width = w;
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
}
