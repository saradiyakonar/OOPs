package Lab_3;

public class Subtraction {
    void subtract(int x, int y){
        System.out.println("Lab_3.Subtraction = "+(x-y));
    }
    void subtract(double x, double y){
        System.out.println("Lab_3.Subtraction = "+(x-y));
    }
    void subtract (int x, int y, int z){
        System.out.println("Lab_3.Subtraction = "+(x-y-z));
    }
}
class Driver{
    public static void main(String [] args){
        Subtraction sub = new Subtraction();
        sub.subtract(5,4);
        sub.subtract(7.0,9.0);
        sub.subtract(15,2,1);
    }
}
