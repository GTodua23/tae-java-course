/** @author გიორგი თოდუა */
package homework9;

import java.util.List;

public class ListUtilities {
    public static <T> void printList(List<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }

    public static <T> T getFirst(List<T> list){
        return list.get(0);
    }

    public static void main(String[] args) {
        List<String> names = List.of("Giorgi", "Anna", "Eka");
        List<Integer> numbers = List.of(10, 20, 30);

       printList(names);
       printList(numbers);

       System.out.println(getFirst(names));
        System.out.println(getFirst(numbers));
    }
}