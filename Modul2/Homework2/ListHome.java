package HomeWork.Modul2.Homework2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListHome {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 8, 8, 9);
        Random random = new Random();
        integers.stream().filter(e -> e > 4)
                .distinct()
                .map(e-> Stream.generate(()-> random.nextInt(10)).limit(e).collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .map(e->e*10)
                .reduce(Integer::sum)
                .ifPresentOrElse(System.out::println, ()->System.out.println(0));

        List<List<Integer>> lists = List.of(List.of(1,2),List.of(3,4,5),List.of());
        lists.stream().sorted((a,b)->(a.size()-b.size())*-1)
                .flatMap(Collection::stream)
                .forEach(System.out::print);


        }
    }
