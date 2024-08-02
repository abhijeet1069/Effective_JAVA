package multiThreading.createThreads;

//To create a new thread, you can either extend the Thread class or implement the Runnable interface.

public class World implements Runnable{

    @Override
    public void run() {
        for( ; ; )
            System.out.println("World");
    }
}
