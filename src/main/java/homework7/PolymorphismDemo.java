/** @author გიორგი თოდუა */
package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Buddy"),
                new Dog("Rex"),
                new Cat("Mia"),
                new Cat("Garfild")
        };

        for (Animal animal : animals){
            if (animal instanceof Dog){
                System.out.println(animal.name + " (Dog): ");
            } else if (animal instanceof Cat){
                System.out.println(animal.name + " (Cat): ");
            }
            animal.makeSound();
            animal.sleep();
        }
    }
}
