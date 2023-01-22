package _02_method_reference;

public class StaticMethods {

    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = StaticMethods::saySomething;
        // Calling interface method
        sayable.say();
    }

}

