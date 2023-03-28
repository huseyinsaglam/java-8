package _12_thread._01_thread;

public class ThreadMain {
    public static void main(String[] args) {

        ThreadTester threadTester = new ThreadTester();
        threadTester.run();

        ThreadTester threadTester1 = new ThreadTester();
        threadTester1.run();
    }
}
