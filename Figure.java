abstract class Figure {
    public abstract void area();
}
class Triangle extends Figure{
    int base = 10;
    int height = 2;
    public void area(){
        System.out.println("Area = "+0.5*base*height);
    }
}
class Rectangle extends Figure{
    int length = 25;
    int breadth = 5;
    public void area(){
        System.out.println( "Area of rectangle = " + length*breadth);
    }
}
class dim{
    public static void main(String [] args){
        Triangle t1 = new Triangle();
        Rectangle r1 = new Rectangle();
        Figure f;
        f=t1;
        t1.area();
        f=r1;
        r1.area();
    }
}
