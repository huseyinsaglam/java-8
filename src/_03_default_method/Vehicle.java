package _03_default_method;

public interface Vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }
}
