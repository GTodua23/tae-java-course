/** @author <გიორგი თოდუა> */

package homework4;

public class Calculator {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        char op = '*';
        switch (op){

            case '+':
            System.out.println(a+b);
            break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b == 0){System.out.println("ნულზე გაყოფა აკრძალულია");}
                else {System.out.println(a / b);}
            break;
            default: {System.out.println("უცნობი ოპერატორი");}
        }
    }
}