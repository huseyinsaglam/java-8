package _11_function_programming._03_supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Java8Tester1 {

    public static void main(String[] args) {

        Developer developer =  Java8Tester1.factory(()->new Developer());
        System.out.println(developer);

        Developer developer1 =  Java8Tester1.factory(()->new Developer("Huseyin"));
        System.out.println(developer1);


    }

    public static Developer factory(Supplier<Developer> supplier){

        Developer developer = supplier.get();
        if (developer != null && developer.getName()!=null &&developer.getName().equals("Huseyin")){
            developer.name = "Huseyin";
            developer.salary = BigDecimal.ONE;
            developer.start = LocalDate.now();
        } else {
            developer.name = "Java";
            developer.salary = BigDecimal.TEN;
            developer.start = LocalDate.MAX;
        }
        return developer;
    }
}

class Developer{
    String name;
    BigDecimal salary;
    LocalDate start;

    public Developer() {
    }

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", start=" + start +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }
}
