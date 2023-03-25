package _11_function_programming._09_biConsumer;

import java.util.function.BiConsumer;

public class Java8Tester {

    public static void main(String[] args) {

        // Consumer<T,U> 		void accept(T t, U u)
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(3,5);

        math(5,5,(a,b) -> System.out.println(a+b));
        math(5,5,(a,b) -> System.out.println(a-b));
        math(5,5,(a,b) -> System.out.println(a*b));
        math(5,5,(a,b) -> System.out.println(a/b));
    }
    public static <T extends Integer> void math (Integer a, Integer b, BiConsumer<Integer,Integer> biConsumer){
        biConsumer.accept(a,b);
    }
}
