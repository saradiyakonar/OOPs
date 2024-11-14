package Lab_1;

import java.util.*;
public class day {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the date");
    int date = sc.nextInt();
    if(date>31){
        System.out.println("Invalid date");
    }
    else{
        int choice = date % 7;

        switch (choice) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:

        }
    }
    sc.close();
    }
}
