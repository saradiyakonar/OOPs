package Lab_7;
import java.util.*;

class HrsException extends Exception{
    int hours;
    HrsException(int h){
        hours=h;
    }
    public String toString(){
        return "InvalidHourException:hour is greater than 24";
    }
}

class MinException extends Exception{
    int minute;
    MinException(int m){

        minute=m;
    }
    public String toString(){
        return "InvalidMinuteException:minutes is greater than 60";
    }
}

class SecException extends Exception{
    int second;
    SecException(int s){
        second=s;
    }
    public String toString(){
        return "InvalidSecondException:seconds is greater than 60";
    }
}

class Time{
    static void compute(int h, int m, int s) throws HrsException, MinException, SecException{
        if(h>24)
            throw new HrsException(h);
        System.out.println("Hours = "+h);
        if(m>60)
            throw new MinException(m);
        System.out.println("Minutes = "+m);
        if(s>60)
            throw new SecException(s);
        System.out.println("Seconds = "+s);
    }
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter hours");
            int h=sc.nextInt();
            System.out.println("Enter minutes");
            int m=sc.nextInt();
            System.out.println("Enter seconds");
            int s= sc.nextInt();
            compute(h,m,s);
        }
        catch(MinException e){
            System.out.println("Caught the exception "+e);
        }
        catch(HrsException e){
            System.out.println("Caught the exception "+e);
        }
        catch (SecException e){
            System.out.println("Caught the exception"+e);
        }
    }
}

