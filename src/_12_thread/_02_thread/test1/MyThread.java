package _12_thread._02_thread.test1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("The job is starting!");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        myThread.run();
        myThread.run();
    }
}
