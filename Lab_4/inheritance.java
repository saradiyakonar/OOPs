package Lab_4;

import java.util.*;
class plate{
    double length, width;
    Scanner sc = new Scanner(System.in);
    plate() {
        System.out.println("Enter length");
        length = sc.nextDouble();
        System.out.println("Enter width");
        width=sc.nextDouble();
    }
    void disp(){
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}
class box extends plate{
    double height;
    box(){
        super();
        System.out.println("Enter height");
        height=sc.nextDouble();
    }
    void disp(){
        super.disp();
        System.out.println("Height = "+height);
    }
}
class wood_box extends box{
    double thick;
    wood_box(){
        super();
        System.out.println("Enter thickness");
        thick=sc.nextDouble();
    }
    void disp(){
        super.disp();
        System.out.println("Thickness = "+thick);
    }
}
public class inheritance {
    public static void main(String [] args){
        System.out.println("Dimensions of Lab_4.plate");
        System.out.println("--------------------");
        plate p1 = new plate();
        p1.disp();
        System.out.println("Dimensions of Lab_4.box");
        System.out.println("-------------------");
        box b1 = new box();
        b1.disp();
        System.out.println("Dimensions of wood Lab_4.box");
        System.out.println("-----------------------");
        wood_box w1 = new wood_box();
        w1.disp();
    }
}