package Lab_10;
public class Lab10_2 extends Thread {

    @Override
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
        Lab10_2 example = new Lab10_2();
        example.start();
        System.out.println("This is from the main thread!");
    }
}
