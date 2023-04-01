package _12_thread._04_thread;

public class TesterMain {

    private  long count = 0;
    public void add(long value){
        this.count = this.count + value;
    }
}
//A ve B olmak uzere 2 tane thread oldugunu dusunelim. Burada value degeri 2 ve 3 olarak deger geldigini varsayalim;
//this.count = 0 degerine sahiptir.
//A threadi register(hafiza)’dan degeri okur. (this.count = 0)
//B threadi register(hafiza)’dan degeri okur. (this.count = 0)
//A thread’i 2 degerini ekler.
//A thread’i 2 degerini register’a yazar. this.count = 2 dir.
//B thread’i zaten degeri okumustu bu noktada 3 degeri ekler.
//B thread’i register’a 3 degerini yazar. this.count = 3 oldu.
//this.count degerini 5 beklerken 3 oldu ! Peki neden boyle oldu ?


// Birden fazla thread , “ayni kaynaga” ulastiginda (read) problem olmaz.
// Problem teskil edecek nokta ; birden fazla thread “ayni kaynaga”(instance variable),
// “ayni obje referansi” uzerinden ulasip degistirmeye calistiginda(write) ortaya cikabilir.
// Bu probleme Race Condition adi verilir.


// Thread Safe & Shared Resources
// Thread safe ; birden fazla thread ayni anda/es zamanli olarak/simutaneously
// metoda erismeye calistiginda problem olmamasi anlamini tasir.
// Burada problemden kasit ; race condition , deadlock , memory consistency error gibi problemlerdir.


// synchronized block ya da metot , race condition durumundan kacinmamizi saglar.
// Java’da syncronized anahtar kelimesi metotlar ve block’larla birlikte kullanilabilir.
// Sadece metotlar ve blocklar synchronized olabilir degiskenler ya da siniflar synchronized olamazlar.
// synchronized yapilan yere sadece bir tane thread girebilir.


// public static synchronized int getCount() {
//		staticCount++;
//		return staticCount;
//	}
//
//	public static int getCount2() {
//		synchronized (MyClass.class) {
//			staticCount++;
//			return staticCount;
//		}
//	}
