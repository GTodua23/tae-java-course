/** @author Giorgi Todua */
package homework6;

public class Car extends Vehicle {
    String doors;
    public Car(String brand, int year, String doors){
        super(brand,year);
        this.doors = doors;

    }
    @Override
    public void info(){
        System.out.println(brand + " " + year + ", " + doors + " doors");
    }
    public static void main(String[] args){
        new Car("Toyota", 2020, "4 doors").info();
    }
}