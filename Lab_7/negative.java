package Lab_7;
import java.util.*;
class NegativeNumberException extends Exception{
    int y;
    NegativeNumberException(int x){
        y=x;
    }
    public String toString(){
        return " NegativeNumberException:positive";
    }
}

class Negative{
    static void processinput(int x) throws NegativeNumberException{
        System.out.println("Called process input("+x+")");
        if(x<0){
            throw new NegativeNumberException(x);
        }
        System.out.println("Double Value = "+2*x);
    }
    public static void main(String [] args) throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int a = sc.nextInt();
            processinput(a);
        }
        catch(NegativeNumberException e){
            System.out.println("Caught Negative Exception" +e);
        }
    }
}