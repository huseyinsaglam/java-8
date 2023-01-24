package _05_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Tester {

    public static void main(String[] args) {

        System.out.println("******************** filter **************************");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        System.out.println("******************* limit ***************************");

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        System.out.println("*************** map *******************************");

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList =  numbers.stream().map(i -> i * i ).distinct().collect(Collectors.toList());
        System.out.println(squaresList);

        System.out.println("*********************** filter - count ***********************");

        List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings2.stream().filter(s -> s.isEmpty()).count();
        System.out.println(count);

        System.out.println("******************* sorted ***************************");

        Random random2 = new Random();
        random2.ints().limit(10).sorted().forEach(System.out::println);

        System.out.println("******************* parallelStream ***************************");
        List ints = Arrays.asList(1, 5, 3, 7, 11, 9, 15, 13);
        ints.parallelStream() // Paralel Stream
                .filter(i -> i != null) // pozitif sayı ise
                .sorted() // sırala
                .forEach(System.out::println); // çıktıla

        /*
        * Bu örnekte filter ve sorted paralel olarak koşturulabilirdir.
        * Fakat forEach metodu doğası gereği öğeleri ardışık çıktılamalıdır.
        *  İşte tam da bu adımda elimizdeki paralel Stream nesnesi ardışıl Stream nesnesine dönüştürülmektedir ve
        *  ardından forEach işlemini koşturmaktadır.
        * */

    }
}
