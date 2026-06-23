/** @author გიორგი თოდუა */
package homework10;

import java.lang.reflect.Method;

public class AnnotationDemo {

    @Author(name = "Giorgi")
    public void firstMethod(){
    }

    @Author(name = "Giorgi", date = "23/06/22")
    public void secondMethod(){
    }

    public static void main(String[] args) {
        Method[] methods = AnnotationDemo.class.getDeclaredMethods();

        for (Method method : methods){
            if (method.isAnnotationPresent(Author.class)){
                Author author = method.getAnnotation(Author.class);

                System.out.println(method.getName() + " -> " +
                        author.name() + " -> " +
                        author.date());
            }
        }

    }
}


//        • AnnotationDemo — class 2 მეთოდით, თითო @Author(name="...")-ით.
//main()-ში reflection-ით წაიკითხე annotation-ი: method.getAnnotation(Author.class).name().