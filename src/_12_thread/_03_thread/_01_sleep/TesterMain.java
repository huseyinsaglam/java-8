package _12_thread._03_thread._01_sleep;

public class TesterMain implements Runnable{

    public static void main(String[] args) {

        TesterMain testerMain1 = new TesterMain();
        Thread thread1 = new Thread(testerMain1);
        thread1.setName("thread1");
        thread1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name :" + Thread.currentThread().getName() + " index:" + i);
            try {
                Thread.sleep(1000);
                // sleep metodu 0.5 saniye hali hazirda calisan thread'in
                // durumunu sleeping(timed_waiting) yapacaktir.
            } catch (InterruptedException e) {
                System.out.println("exception handled");
            }
        }
    }
}
