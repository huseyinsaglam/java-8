package _12_thread._03_thread._02_priority;

public class TesterMain implements Runnable{

    public static void main(String[] args) {
        TesterMain testerMain1 = new TesterMain();
        Thread thread1 = new Thread(testerMain1);
        thread1.setName("thread1");



        TesterMain testerMain2 = new TesterMain();
        Thread thread2 = new Thread(testerMain2);
        thread2.setName("thread2");



        TesterMain testerMain3 = new TesterMain();
        Thread thread3 = new Thread(testerMain3);
        thread3.setName("thread3");

        // Bir cok JVM icin threadlerin priority degeri onemlidir.
        // Birden fazla thread runnable durumundaysa yuksek oncelige(priority) sahip thread running durumuna gecirilmek
        // icin tercih edilebilir.
        //Bununla birlikte , bu durumun bir garantisi yoktur.
        //Priority degerleri daha etkili/verimli program olmasi acisindan kullanilabilir
        // fakat oncelik siralamasi garanti bir sekilde calismayacaktir.
        // Bu deger genel olarak 1-10 arasinda degismektedir, fakat farkli Thread Schedulerlar icin bu deger 10dan kucuk de olabilir.


        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " index:" + i);
        }
    }
}
