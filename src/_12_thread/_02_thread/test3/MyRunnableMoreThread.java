package _12_thread._02_thread.test3;

public class MyRunnableMoreThread implements Runnable{
    @Override
    public void run() {
        System.out.println("run method()");
        for (int i = 0; i < 10; i++) {
            String name = Thread.currentThread().getName();
            long id = Thread.currentThread().getId();
            System.out.println("index:" + i + " " + name + " " + id);
        }
    }
}
