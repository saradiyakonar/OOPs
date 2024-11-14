package Lab_3;

import java.util.*;
public class  Area {
    void area(double r){
        double area_circle = 3.14*r*r;
        System.out.println("The area of the circle is "+area_circle);
    }
    void area (double height, double base){
        double area_triangle = 0.5*height*base;
        System.out.println("The area of the triangle is "+area_triangle);
    }
    void area(int side){
        int area_square = side*side;
        System.out.println("The area of the square is "+area_square);
    }
}
class Area1 {
    public static void main(String [] args){
        Area area1 = new Area();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        area1.area(radius);
        System.out.println("Enter the height and base of the triangle");
        double height=sc.nextDouble();
        double base = sc.nextDouble();
        area1.area(height,base);
        System.out.println("Enter the side of the square");
        int side = sc.nextInt();
        area1.area(side);
    }
}
