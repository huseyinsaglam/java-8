package _12_thread._03_thread._04_join;

public class TesterMain implements Runnable{

    // join metodu , bir thread bitene kadar(run metodu sonlana kadar) diger thread lerin beklemesini saglar.
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name:" + Thread.currentThread().getName() + " index:" + i);
        }
    }

    public static void main(String[] args)  throws InterruptedException{

        TesterMain runnable = new TesterMain();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.setName("myThread1");
        thread2.setName("myThread2");
        thread3.setName("myThread3");

        thread1.start();
        thread1.join();
        // thread1 bitene kadar baska thread calismaz.

        thread2.start();
        thread2.join();
        // thread2 bitene kadar baska thread calismaz.

        thread3.start();
    }
}
