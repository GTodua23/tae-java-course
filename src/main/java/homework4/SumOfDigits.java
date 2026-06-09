/** @author <გიორგი თოდუა> */
package homework4;

public class SumOfDigits {
    public static void main(String[] args){
        int birthYear = 2000;
        int sum = 0;
        while (birthYear > 0) {
            sum+= birthYear%10;
            birthYear=birthYear/10;
        }
        System.out.println("ჯამი :"+ sum);
        }
    }