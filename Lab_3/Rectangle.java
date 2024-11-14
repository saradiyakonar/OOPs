package Lab_3;

import java.util.*;
public class Rectangle {
    Scanner sc = new Scanner(System.in);
    double l,b,area,perimeter;
    void read() {
        System.out.println("Enter the values of length and breadth");
        l = sc.nextDouble();
        b = sc.nextDouble();
    }

    void calculate() {
        area = l * b;
        perimeter = (2 * (l + b));
    }

    void display () {
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
class Main{
    public static void main(String [] args){
        Rectangle rect1 = new Rectangle();
        rect1.read();
        rect1.calculate();
        rect1.display();

    }

}
