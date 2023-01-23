package _03_default_method;

public class Car implements Vehicle,FourWheeler{

    @Override
    public void print() {
        Vehicle.super.print();
    }
}
