package _11_function_programming._07_biPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Java8Tester {
    public static void main(String[] args) {

        List<Domain> domains = Arrays.asList(new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("mkyong.com", 0),
                new Domain("microsoft.com", 2));

        BiPredicate<String, Integer> predicate = (domain, score) -> {
            return domain.equalsIgnoreCase("google.com") || score.intValue() == 0;
        };

        List<Domain> list = filterBadDomain(domains, predicate);
        System.out.println(list);

        List<Domain> list1 = filterBadDomain(domains, (domain,score) -> score.intValue() == 0);
        System.out.println(list1);

        List<Domain> list2 = filterBadDomain(domains, (domain,score) -> domain.startsWith("i") && score.intValue()>5);
        System.out.println(list2);
    }

    public static <T extends Domain> List<T> filterBadDomain (List<T> list, BiPredicate<String, Integer> biPredicate){

        return list.stream().filter( x -> biPredicate.test(x.name,x.score)).collect(Collectors.toList());

    }
}

class Domain {

    String name;
    Integer score;

    public Domain(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
