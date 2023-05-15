public class Square extends Rectangle{
    Square(){
        super(1.0,1.0);
    }
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public double getWidth(){
        return super.getWidth();
    }
    @Override
    public  String toString(){
        return "A Square with side="+super.getWidth()+", which is a subclass of "+super.toString();
    }
}
