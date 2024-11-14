package Lab_5;

interface Motor{
    double capacity = 16.5;
    void run();
    void consume();
}

public class Washing_Machine implements Motor{
    public void run(){
        System.out.println("Washing machine is running...");
    }
    public void consume(){
        System.out.println("Washing machine is consuming electricity...");
        System.out.println("Capacity of washing machine = "+capacity);
    }
    public static void main(String [] args){
        Washing_Machine w1 = new Washing_Machine();
        w1.run();
        w1.consume();
    }
}