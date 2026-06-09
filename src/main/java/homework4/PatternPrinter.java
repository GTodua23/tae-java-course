/** @author <გიორგი თოდუა> *//** @author <გიორგი თოდუა> */
package homework4;

public class PatternPrinter {
    public static void main(String[] args){
       String name = "გიორგი";
               for (int i = 1; i<= name.length(); i++){
                   for (int g =1; g<=i;g++ ){
                       System.out.print("*");
                   }
                   System.out.println();
               }
    }
}
