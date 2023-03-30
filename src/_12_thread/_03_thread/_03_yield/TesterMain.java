package _12_thread._03_thread._03_yield;

public class TesterMain implements Runnable{

    public static void main(String[] args) {

        TesterMain testerMain1 = new TesterMain();
        Thread thread1 = new Thread(testerMain1);
        thread1.setName("thread1");
        thread1.yield();



        TesterMain testerMain2 = new TesterMain();
        Thread thread2 = new Thread(testerMain2);
        thread2.setName("thread2");
        thread2.yield();



        TesterMain testerMain3 = new TesterMain();
        Thread thread3 = new Thread(testerMain3);
        thread3.setName("thread3");
        thread3.yield();

        thread1.setPriority(10);
        thread2.setPriority(5);
        thread3.setPriority(1);

        thread1.start();
        thread2.start();
        thread3.start();



    }
    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("************************");
            System.out.println(Thread.currentThread().getName() + " index:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("exception handled");
            }
        }

    }

    // yield metodunun bir garantisi yoktur.
    // Kullanıldıgı nesne ile aynı oncelige sahip thread nesnesinin çalışmasını bekler ve bu nesnenin işi bittikten hemen sonra
    // tekrar çalişir duruma geçer

}
