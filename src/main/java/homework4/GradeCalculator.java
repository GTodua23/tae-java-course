/** @author <გიორგი თოდუა> *//** @author <გიორგი თოდუა> */
package homework4;

public class GradeCalculator {
    public static void main(String[] args){
        int birthMonth = 12;
        if (birthMonth == 12) {System.out.println("grade = A");}
        else if (birthMonth>=9 && birthMonth<=11) {System.out.println("grade = B");}
        else if (birthMonth>=6 && birthMonth<=8) {System.out.println("grade = C");}
        else if (birthMonth>=3 && birthMonth<=5) {System.out.println("grade = D");}
        else {System.out.println("grade = F");}
    }
}