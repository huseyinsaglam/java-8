package _11_function_programming._02_biFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8Tester {
    public static void main(String[] args) {

        System.out.println("****************************************");
        BiFunction<Integer,Integer,Double> biFunction = (x1,x2)-> Math.pow(x1,x2);
        System.out.println(biFunction.apply(2,4));

        System.out.println("****************************************");
        BiFunction<Integer,Integer,Double> biFunction1 = (x1,x2)-> Math.pow(x1,x2);
        Function<Double, String> function = x -> "Result : " + String.valueOf(x);

        String s = biFunction1.andThen(function).apply(3,4);
        System.out.println(s);

        System.out.println("****************************************");
    }
}
