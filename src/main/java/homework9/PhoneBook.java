/** @author გიორგი თოდუა */
package homework9;

import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, String> contacts = new HashMap<>();
    public static String findPhone(String name){
        if (contacts.containsKey(name)){
            return contacts.get(name);
        }
        return "არ მოიძებნა";
    }
    public static void main(String[] args) {
        contacts.put("გიორგი","555121314");
        contacts.put("იო","555121314");
        contacts.put("ელე","555121314");
        contacts.put("სანდრო","555121314");

        System.out.println(findPhone("გიორგი"));
        System.out.println(findPhone("ვალერი"));

        for (String key : contacts.keySet()){
            System.out.println(key + " -> " + contacts.get(key));
        }
    }
}