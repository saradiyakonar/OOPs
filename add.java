import java.util.*;
public class add {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println("The sum of the two numbers " +x+" and " +y+ " is = " +(x+y));

        sc.close();
    }
    
}
