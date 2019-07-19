package ThreadPrac;

import static java.lang.Thread.sleep;

public class RunnableExam implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) { }
    }

    public static void main(String[] args) {
        RunnableExam re = new RunnableExam();

        Thread t1 = new Thread(re, "thread1");
        Thread t2 = new Thread(re, "thread2");

        t1.start();
        t2.start();
    }
}
