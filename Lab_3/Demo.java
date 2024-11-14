package Lab_3;

import java.util.*;
class Box {
    double length;
    double width;
    double height;
    void volume(){
        System.out.println("The volume of the box is ");
        System.out.println(length*width*height);
    }
}
public class Demo {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        Box box1 = new Box();
        System.out.println("Enter the height, width, and length of the Lab_4.box");
        box1.height = sc.nextInt();
        box1.width = sc.nextInt();
        box1.length = sc.nextInt();
        box1.volume();
    }
}