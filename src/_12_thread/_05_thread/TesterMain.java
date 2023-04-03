package _12_thread._05_thread;

public class TesterMain {
}

// Deadlock ; 2 veya daha fazla thread’in birbirlerini blocklama durumudur. Her objenin built-in bir kilidi(lock) vardir.

//Thread’ler , birbirlerinin elinde bulunan obje kilidini bekledigi durumda bu blocklama durumu soz konusu olacaktir.

//Thread 1 synchronized bir methoda girer ve A kilidini ele gecirir.
// Daha sonrasinda yeni bir synchronized metoda girmeye calisir fakat bu metoda girmek icin gerekli olan obje kilidi
// Thread 2 nin elindedir(B kilidi). Bu durumda Thread 1 , Thread 2 nin isini bitirmesini ve obje kilidini birakmasini bekler(B kilidi).

//Bu sirada Thread 2 , synchronized bir metoda girer ve B kilidini ele gecirir.
// Bu metod icerisinde synchronized bir method yer almaktadir ve A kilidi gerekmektedir, fakat A kilidi Thread 1’in elinde bulunmaktadir.
// Bu durumda Thread 2 , Thread 1 ‘in isini bitirmesini ve obje kilidini birakmasini bekler(A kilidi).

//Thread 1 , B kilidini beklemektedir.Thread 2 ise A kilidini beklemektedir.
// Threadlerin birbirlerinin kilitlerine ihtiyac duydugu ve birakmasini/release bekledigi bu durumda deadlock durumu ortaya cikacaktir.

// Bu problemi cozmek icin kilitlerin yerini degistirebiliriz
// ya da bu tarz bir lock mekanizmasi yerine java.util.concurrent.locks paketinde yer alan Lock arabirimi kullanilarak timeout suresi verilebilir
