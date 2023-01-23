package _03_default_method;

public interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}
