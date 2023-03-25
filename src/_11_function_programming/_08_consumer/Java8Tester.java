package _11_function_programming._08_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Tester {

    public static void main(String[] args) {

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Selam");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        getAll(list,x -> System.out.println(x));

        Consumer<Integer> consumer1 = (Integer x) -> System.out.println(x);
        getAll(list,consumer1);
    }
    public static <T> void getAll(List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }
}
