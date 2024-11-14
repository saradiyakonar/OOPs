package Lab_5;

import java.util.*;
abstract class stud {
    abstract void course();
    void getinput(int roll, long reg){
        System.out.println("Roll No. -"+roll);
        System.out.println("Registration No. -"+reg);
    }
}
class kiitian extends stud{
    void course(){
        System.out.println("Course - B.Tech (Computer Science & Engg.)");
    }
}

class Student1{
    public static void main(String [] args){
        kiitian stud = new kiitian();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Roll No.");
        int roll = sc.nextInt();
        System.out.println("Enter Registration No. ");
        long reg = sc.nextLong();
        stud.getinput(roll,reg);
        stud.course();
    }
}