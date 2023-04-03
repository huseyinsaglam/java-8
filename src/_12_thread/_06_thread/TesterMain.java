package _12_thread._06_thread;

public class TesterMain {

    public static void main(String[] args) {

        Calculate calculateThread = new Calculate();
        calculateThread.start();

        synchronized (calculateThread) {
            try {
                System.out.println("Waiting for calculateThread to complete...");
                calculateThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("total is: " + calculateThread.total);
            System.out.println("counter is: " + calculateThread.counter);
        }
    }
}

class Calculate extends Thread{

    int total;
    int counter;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100000; i++) {
                total += i;
                counter = i;
            }
            notify();
        }
    }


}

// wait , notify ve notifyAll metotlari mutlaka synchronized metot veya block icerisinden cagrilmalidir.
// Bir thread ilgili objenin kilidini ele gecirmeden wait ya da notify metotlarini cagiramaz.

// calculateThread i start metodu ile calistirdikdan sonra , islemini tamamlamasini bekliyoruz.
// Bunun icin Calculate objesi uzerinden (calculateThread referans degiskeni) synchronized kod blogu yaziyoruz.
// wait metodunu calculateThread referans degiskeni uzerinden cagiriyoruz boylelikle bu thread sonlana kadar diger
// threadlerin calismasini engelliyoruz.(block)

// notify metodunu cagirarak , isimizin bittigini bildiriyoruz(notification) .
// Boylelikle blockladigimiz thread(main threadi) tekrar calismaya devam ediyor.
