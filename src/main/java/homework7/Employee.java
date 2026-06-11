/** @author გიორგი თოდუა */
package homework7;

public abstract class Employee {
    protected String name;

    public Employee(String name){
        this.name = name;
    }
    abstract double calculateSalary();

    public void printInfo(){
        System.out.println("Employee: " + name);
    }
}
