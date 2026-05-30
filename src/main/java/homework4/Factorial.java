/** @author <გიორგი თოდუა> */
package homework4;

public class Factorial {
    public static void main(String[] args){
        int birthDate = 23;
        long factorial = 1;
        for (int i =1; i<= birthDate;i++){
            factorial *=i;
        }
        System.out.println(birthDate+"! = "+factorial);
    }
}
