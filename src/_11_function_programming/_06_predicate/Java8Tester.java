package _11_function_programming._06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Tester {
    public static void main(String[] args) {

        // Predicate<T> boolean test(T t)
        Predicate<Integer> predicate = x -> x>5;
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list1 = list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(list1);

        System.out.println(predicate.test(88));

    }
}
