/** @author გიორგი თოდუა */
package homework7;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
       System.out.println("Meow!");
    }

    public static void main(String[] args) {
       Dog d = new Dog("Rex"); d.makeSound(); d.sleep();
       Cat c = new Cat("Garfild"); c.makeSound(); c.sleep();
    }
}
