package multiThreading.threadState;

class Thread1 implements Runnable{

    @Override
    public void run() {
        while(true)
            System.out.println("Hello from Thread1");
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        while(true)
            System.out.println("Hello from Thread2");
    }
}

public class DaemonThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();


        System.out.println("Main completed");
    }
}
