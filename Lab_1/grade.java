package Lab_1;

import java.util.*;
public class grade {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks received");
        int marks = sc.nextInt();

        if( marks >=90){
            System.out.println("Grade received: O");
        }
        else if(marks >= 80){
            System.out.println("Grade received : E");
        }
        else if (marks >=70){
            System.out.println("Grade received : A");
        }
        else if (marks >=60){
            System.out.println("Grade received : B");
        }
        else if (marks >=50){
            System.out.println("Grade received : C");
        }
        else if (marks >=40){
            System.out.println("Grade received : D");
        }
        else {
            System.out.println("Student Failed");
        }
        sc.close();
    }
    
}
