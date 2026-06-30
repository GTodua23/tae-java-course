/** @author გიორგი თოდუა */
package homework9;

public class GenericBox {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);

        System.out.println("String box: " + stringBox.get());
        System.out.println("Integer box: " + integerBox.get());
        System.out.println("Double box: " + doubleBox.get());
    }
}