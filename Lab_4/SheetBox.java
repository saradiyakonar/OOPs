package Lab_4;

import java.util.Scanner;
class Sheet2D{
    double length,breadth,area,cost;
    void area(double l, double b){
        length=l;
        breadth=b;
        area=l*b;
    }
    void cost(){
        cost=area*40;
    }
    void display(){
        System.out.println("Lab_3.Area of the 2D box is "+area+" square ft.");
        System.out.println("The cost of the 2D box is Rs."+cost);
    }
}

class Sheet3D extends Sheet2D{
    double height, volume;
    void volume(double h, double l, double b){
        super.area(l,b);
        height=h;
        volume=area*height;
    }
    void cost(){
        cost=volume*60;
    }
    void display(){
        System.out.println("Volume of the 3D box is "+volume+" cubic ft.");
        System.out.println("Cost of the 3D box is Rs."+cost);
    }
}
public class SheetBox{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Sheet2D s2 = new Sheet2D();
        System.out.println("Enter length and breadth");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        s2.area(l,b);
        s2.cost();
        s2.display();
        Sheet3D s3 = new Sheet3D();
        System.out.println("Enter height");
        double h= sc.nextDouble();
        s3.volume(h, l, b);
        s3.cost();
        s3.display();
    }

}