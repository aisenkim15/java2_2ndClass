package ThreadPrac;

public class ThreadJoin extends Thread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "Thread has started"
        );
        ThreadJoin e = new ThreadJoin();
        e.setName("thread1");
        e.start();

        try {
            e.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "Thread Ended");

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Thread started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "Thread Ended");

    }
}
