package Lab_3;

import java.util.*;
class Details{
    String name;
    int roll;
    float cgpa;
}

public class Student{
    public static void main(String [] args){
        Details stu = new Details();
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of students : ");
        int n = sc.nextInt();
        String min_name = "";
        float min = 10;

        for (int i = 0; i < n; i++){
            System.out.println("Roll number, Name and cgpa of student : ");
            stu.roll = sc.nextInt();
            stu.name = sc.next();
            stu.cgpa = sc.nextFloat();

            System.out.println("Name : "+stu.name);
            System.out.println("Roll no : "+stu.roll);
            System.out.println("cgpa : "+stu.cgpa);

            if (min > stu.cgpa){
                min = stu.cgpa;
                min_name = stu.name;
            }
        }

        System.out.println(min_name+" has minimum cgpa of "+min);

        sc.close();
    }
}