package Lab_10;
import java.util.*;
public class Lab10_1 implements Runnable {

    public void run() {
        System.out.println("This is from a new thread!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Lab10_1 example = new Lab10_1();
        Thread thread = new Thread(example);
        thread.start();
        System.out.println("This is from the main thread!");
    }
}
