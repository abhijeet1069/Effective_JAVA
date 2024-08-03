package multiThreading.threadState;

import java.util.Arrays;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        //NEW
        System.out.println(t1.getState());
        t1.start();
        //RUNNABLE
        System.out.println(t1.getState());
        Thread.sleep(100);
        //TIMED_WAITING
        System.out.println(t1.getState());
        t1.join(); //main which the caller will have to wait for t1 to finish
        //TERMINATED
        System.out.println(t1.getState());
    }
}
