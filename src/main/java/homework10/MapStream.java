/** @author გიორგი თოდუა */
package homework10;

import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Beka", "Cita");

        List<String> upperName = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(upperName);
        System.out.println(lengths);
    }
}