package Lab_3;

import java.util.Scanner;
public class Rectt {
    double length, breadth;
    Rectt(){
        length=0;
        breadth=0;
    }
    Rectt(double l, double b){
        length=l;
        breadth=b;
    }
    void area(){
        System.out.println("Lab_3.Area of the rectangle is "+(length*breadth));
    }
}

class Overloading{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Rectt rect1 = new Rectt();
        rect1.area();
        System.out.println("Enter the length and breadth");
        double l=sc.nextInt();
        double b=sc.nextInt();
        Rectt rect2 = new Rectt(l,b);
        rect2.area();
    }
}