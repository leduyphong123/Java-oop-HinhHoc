public class Rectangle extends Shape{
    double width,length;
    Rectangle(){
        width=1.0;
        length=1.0;
    }
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return  width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of"+super.toString();
    }
}
