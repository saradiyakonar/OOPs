package Lab_7;
import java.util.*;

public class ArrayCatch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the numbers");
            int [] arr = new int [4];
            for(int i=0; i<=arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob: " + e);
        }
    }
}
