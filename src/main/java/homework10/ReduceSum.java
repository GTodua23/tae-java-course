/** @author გიორგი თოდუა */
package homework10;

import java.util.List;


public class ReduceSum {
    public static void main(String[] args) {
       List<Integer> num = List.of(1, 2, 3, 4, 5);

       int sum = num.stream()
               .reduce(0, Integer::sum);

       int product = num.stream()
               .reduce(1, (a, b) -> a * b);

       int max = num.stream()
                .reduce(Integer::max)
                .orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max);
    }
}