package _11_function_programming._05_unaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Java8Tester {
    public static void main(String[] args) {

        System.out.println("***************************************");
        // UnaryOperator<T> extends Function<T, T> => UnaryOperator<T> 	T apply(T t)
        UnaryOperator<Integer> unaryOperator = x -> x*2;
        Integer integer = unaryOperator.apply(5);
        System.out.println(integer);

        System.out.println("***************************************");
        UnaryOperator<Integer> unaryOperator1 = x -> x*2;
        Integer  sonuc =hesaplama(Arrays.asList(1,2,3,4,5,6,7,8,9,10),0,unaryOperator1);
        System.out.println(sonuc);

    }

    private static Integer hesaplama(List<Integer> asList, int i, UnaryOperator<Integer> unaryOperator1) {

        int sonuc = i;
        for (Integer j : asList){
            sonuc = sonuc + unaryOperator1.apply(j);
        }
        return sonuc;
    }
}
