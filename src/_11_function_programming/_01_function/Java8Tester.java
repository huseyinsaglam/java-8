package _11_function_programming._01_function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Java8Tester {

    public static void main(String[] args) {

        System.out.println("****************************************");
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Java 8 Functions"));

        System.out.println("****************************************");
        Function<String,Integer> function1 = x -> x.length();
        Function<Integer,Integer> function2 = x -> x*2;

        Integer integer = function1.apply("Java 8 learn");
        System.out.println(function2.apply(integer));

        Integer integer1 = function1.andThen(function2).apply("Java 8 learn");
        System.out.println(integer1);

        System.out.println("****************************************");
        List<String> list = Arrays.asList("Huseyin","Saglam","Fenerbahce","Sampiyon");
        Function<String,Integer> function3 = x -> x.length();
        System.out.println(convertToListMap(list,function3));

    }

    public static <T,R> Map<T,R> convertToListMap(List<T> list, Function<T,R> function){

        Map<T,R> map = new HashMap<>();

        for (T t : list){
            map.put(t,function.apply(t));
        }
        return map;
    }



}
