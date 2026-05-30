/** @author <გიორგი თოდუა> */
package homework4;

public class PrimeCheck {
    public static void main(String[] args){
        int age = 26;
        boolean isPrime=true;
        for (int i = 2; i<=age/2; i++){
            if(age % i == 0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){System.out.println("მარტივი რიცხვია");}
        else {System.out.println("არ არის მარტივი რიცხვი");}
    }
}