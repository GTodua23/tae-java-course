/** @author გიორგი თოდუა */
package homework7;

public class Bike extends Vehicle{

    public Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + "pedaling...");
    }
    public static void main(String[] args) {
      new Car("Toyota").start();
      new Bike("Trek").stop();
    }
}
