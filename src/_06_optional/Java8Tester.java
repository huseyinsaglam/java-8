package _06_optional;

import java.util.Optional;

public class Java8Tester {

    public static void main(String[] args) {

        Java8Tester java8Tester = new Java8Tester();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        System.out.println("******************* Optional.ofNullable ***************************");
        //Optional.ofNullable - gecirilen parametrenin bos olmasına izin verir.
        Optional<Integer> a = Optional.ofNullable(value1);
        System.out.println("Optional.ofNullable = " + a);

        System.out.println("******************* Optional.of ***************************");
        //Optional.of - gecirilen parametrenin bos olmasına izin vermez
        Optional<Integer> b = Optional.of(value2);
        System.out.println("Optional.of = " + b.get());

        System.out.println("******************* sum method ***************************");
        Optional<Integer> c = Optional.of(value2);
        System.out.println(java8Tester.sum(a,c));
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {

        //Optional.isPresent - değerin var olup olmadığını kontrol eder
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - varsa değeri döndürür, aksi takdirde döndürür
        //varsayılan değer geçti
        Integer value1 = a.orElse(new Integer(20));

        //Optional.get - degeri alır
        Integer value2 = b.get();
        return value1 + value2;

        // Optional.ifPresent - Bir değer varsa islem yapar aksi yoksa hiçbir şey yapmaz.
    }
}
