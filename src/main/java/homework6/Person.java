/** @author Giorgi Todua */
package homework6;

public class Person {
   private String name;
   private int age;
   private String email;

   public Person (String name,int age,String email){
       this.name=name;
       this.age=age;
       this.email=email;

   }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }
   public String getEmail(){
       return email;
   }
   public void introduce(){
       System.out.println("გამარჯობა, მე ვარ " + name + ", " + age + " წლის");
   }

    public static void main(String[] args) {
       Person P1 = new Person("გიორგი", 26, "giorgi.todua@credo.ge");
       Person P2 = new Person("ანა", 25, "ana@credo.ge");

       P1.introduce();
       P2.introduce();
       System.out.println("სახელი: " + P1.getName() + ", ასაკი: " + P1.getAge() +
               ", მეილი: " + P1.getEmail());

    }
}