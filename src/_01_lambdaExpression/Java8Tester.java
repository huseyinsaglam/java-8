package _01_lambdaExpression;

public class Java8Tester {

    public static void main(String args[]) {

        Java8Tester tester = new Java8Tester();

        // tip belirterek kullanimi
        MathOperation addition = (int a, int b) -> a + b;

        // tip belirtmeden kullanimi
        MathOperation subtraction = (a, b) -> a - b;

        // kume parantezleri ile birlikte return ifadesi ile kullanimi
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // tip belirterek kullanimi
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // parantessiz kullanimi
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // parantezli ile kullanimi
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}


interface MathOperation {
    int operation(int a, int b);
};

interface GreetingService {
    void sayMessage(String message);
};

