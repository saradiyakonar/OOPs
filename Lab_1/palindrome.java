package Lab_1;

import java.util.*;
public class palindrome {

    public static int reverse(int number){
        int reverse=0;
        while(number != 0)   
        {  
        int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
        number = number/10;  
        }
        return reverse;
    } 

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to be checked");
        int x = sc.nextInt();
        int pal=x;
        if(reverse(x)==pal){
            System.out.println("Number is Lab_1.palindrome");
        }
        else{
            System.out.println("Number is not Lab_1.palindrome");
        }
        sc.close();
    }
}


