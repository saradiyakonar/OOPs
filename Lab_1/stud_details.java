package Lab_1;

import java.util.*;
public class stud_details {
    public static void main(String args[]){
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter Lab_1.name:");
        String name = sc.nextLine();
        System.out.println("Enter roll number:");
        int roll = sc.nextInt();
        System.out.println("Enter section:");
        int section = sc.nextInt();
        System.out.println("Enter branch:");
        String branch = sc.nextLine();
        branch = sc.nextLine(); //buffer
        System.out.println("Name of the Lab_3.Student: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("Section: "+section);
        System.out.println("Branch: "+branch);

        sc.close();
    }
    
}
