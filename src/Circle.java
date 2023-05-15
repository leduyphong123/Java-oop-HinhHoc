public class Circle extends Shape {
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius= "+ radius +", which is a subclass of"+super.toString();
    }
}
