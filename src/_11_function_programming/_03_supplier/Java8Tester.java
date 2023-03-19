package _11_function_programming._03_supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Java8Tester {

    public static void main(String[] args) {

        System.out.println("**********************************************");
        Supplier<LocalDate> supplier = () -> LocalDate.now();
        LocalDate time = supplier.get();
        System.out.println(time);
        System.out.println("**********************************************");
    }
}
