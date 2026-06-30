/** @author გიორგი თოდუა */
package homework9;
import java.util.ArrayList;

public class NamesList {
    public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();
      names.add("Giorgi");
      names.add("Nino");
      names.add("Luka");
      names.add("Anna");
      names.add("Eka");

      System.out.println("Size: " + names.size() +
              " First: " + names.get(0) +
              " Last: " + names.get(names.size()-1));

      names.remove(2);

        System.out.println("Contains Anna? " + names.contains("Anna"));

      for (String name : names){
          System.out.println(name);
      }
    }
}