package ThreadPrac;

public class ThreadExam extends Thread{
    public ThreadExam(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        ThreadExam t1 = new ThreadExam("thread1");
        ThreadExam t2 = new ThreadExam("thread2");

        t1.start();
        t2.start();
    }
}
