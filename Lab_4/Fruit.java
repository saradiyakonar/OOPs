package Lab_4;

class Apple{
    void show(){
        System.out.println("Inside class Lab_4.Apple...");
    }
}
class Banana extends Apple{
    void show(){
        System.out.println("Inside class Lab_4.Banana...");
    }
}
class Cherry extends Apple{
    void show(){
        System.out.println("Inside class Lab_4.Cherry");
    }
}
public class Fruit {
    public static void main(String [] args){
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();
        Apple ref;
        ref=apple;
        ref.show();
        ref=banana;
        ref.show();
        ref=cherry;
        ref.show();
    }
}
