import Geometry.*;
import java.util.*;
public class demmo extends circle{
    void area(double radius){
        System.out.println("Area = " + 3.14*radius*radius);
    }

}
class B{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        demmo d1 = new demmo ();
        d1.setRadius(a);
        System.out.println("The radius is "+d1.getRadius());
        d1.area(a);
    }
}
