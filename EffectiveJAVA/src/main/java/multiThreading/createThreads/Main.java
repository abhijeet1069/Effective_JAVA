package multiThreading.createThreads;

public class Main {
    public static void main(String[] args) {

        World world = new World(); // NEW
        Thread t1 = new Thread(world);
        t1.start(); // RUNNABLE

        for(; ; )
            System.out.println("Hello");
    }
}
