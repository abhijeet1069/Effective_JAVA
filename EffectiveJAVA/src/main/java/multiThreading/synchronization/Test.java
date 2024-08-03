package multiThreading.synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread t1, t2 is having common object counter. Thus giving a race condition.
        // Sometimes result is 2000, sometimes not
        // synchronized increment() solves this issue
        MyThread t1  = new MyThread(counter);
        MyThread t2  = new MyThread(counter);

        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(counter.getCount());
        }
    }
}
