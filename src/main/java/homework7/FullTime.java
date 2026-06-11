/** @author გიორგი თოდუა */
package homework7;

public class FullTime extends Employee{
    double monthlySalary;

    public FullTime(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
