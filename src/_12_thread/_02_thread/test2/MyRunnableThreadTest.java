package _12_thread._02_thread.test2;

import _12_thread._02_thread.test2.MyRunnableThread;

public class MyRunnableThreadTest {
    public static void main(String[] args) {

        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread thread = new Thread(myRunnableThread);
        thread.start();

    }
}
