/** @author <გიორგი თოდუა> */
package homework4;

public class EvenOddCounter {
    public static void main(String[] args){
        int birthyear = 2023;
        int ltd = birthyear % 100;
        int odd = 0;
        int even = 0;
        for (int i = 1; i<=ltd; i++){
            if (i % 2 == 0) {even ++;}
            else {odd++;}
        }
        System.out.println("ლუწი: " + even);
        System.out.println("კენტი: " + odd);
    }
}
