package _12_thread._02_thread.test3;

import _12_thread._02_thread.test3.MyRunnableMoreThread;

public class RunnableMoreThreadTest {
    public static void main(String[] args) {

        MyRunnableMoreThread myRunnable = new MyRunnableMoreThread();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);


        t1.setName("First");
        t2.setName("Second");
        t3.setName("Third");

        /*Bu ciktinin bir GARANTISI yoktur!
        Burada hangi thread’in once calisacagi, hangisinin ne kadar calisacaginin(duration) bir garantisi yoktur.
        Bir thread baslatiktan sonra isi bitmeden(run metodu tamamlanmadan) digeri baslayabilir/calisabilir.
        Burada onemli nokta her bir thread icin run() metodu tamamlanacaktir.*/

        t1.start();
        t2.start();
        t3.start();



         /*Bununla birlikte burada sonuc/cikti GARANTIDIR.
        Diger metot cagrilmalarinda oldugu gibi calisacaktir.
        run metodu ilk kez cagrildiktan sonra bittikten sonra 2 ve 3.kez cagrilacaktir.*/

        t1.run();
        t2.run();
        t3.run();



        // Not - 1
        // Bir thread calismasini sonlandirdiginda(run metodu tamamlandiginda) olu/dead duruma gecer.
        // Teknik olarak API de karsiligi TERMINATED durumudur.
        // Bununla birlikte Thread objesi hala yasamaktadir. Thread in TERMINATED durumda olmasi objenin silinmesine neden olmaz.


        // Not - 2
        // Bir thread TERMINATED duruma geldiginde artik yeniden baslatilamaz.
        // Bir thread referans degikseni uzerinden 2.kez start() metodunu cagiramayiz bu durumda IllegalThreadStateException hatasi aliriz.
        // Bir thread yeniden baslatilamaz.
        // Ornegin =>
        //  t1.start();
        //  t1.start();
        // IllegalThreadStateException hatasi alir

        // Not - 3
        // run metodunu cagirmak yeni bir thread baslatmaz, diger metot cagrilmalari gibi ayni stack uzerinde cagrilir.
        // Ornegin =>
        //  t1.run();
        //  t1.run();
        // IllegalThreadStateException hatasi almaz.


    }
}
