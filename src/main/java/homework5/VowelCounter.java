/** @author <გიორგი თოდუა> */
package homework5;

public class VowelCounter {
    public static  int countVowels(String s){
    int count=0;
    for (int i=0;i<s.length();i++) {
       char ri = Character.toLowerCase(s.charAt(i));

        switch (ri){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
           count++;
           break;
            default:
        }
    }
    return count;
    }

    public static void main(String[] args){
        System.out.println(countVowels("Giorgi Todua"));
    }
}
