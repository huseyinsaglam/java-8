package _11_function_programming._04_binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Java8Tester {
    public static void main(String[] args) {

        System.out.println("***************************************");
        // BinaryOperator<T> extends BiFunction<T,T,T>  => BinaryOperator<T> 	T apply(T t1, T t2)
       BinaryOperator<Integer> binaryOperator = (x1,x2)->x1+x2;
       Integer integer = binaryOperator.apply(3,4);
       System.out.println(integer);

        System.out.println("***************************************");
        BinaryOperator<Integer> binaryOperator1 = (x1,x2)->x1+x2;
        Integer  sonuc =hesaplama(Arrays.asList(1,2,3,4,5,6,7,8,9,10),0,(x1,x2)-> x1+x2);
        System.out.println(sonuc);
    }

    public static <T> T hesaplama(List<T> list, T t, BinaryOperator<T> binaryOperator){

        T result = t ;
        for (T i : list){
            result = binaryOperator.apply(result,i);
        }
        return result;
    }
}
