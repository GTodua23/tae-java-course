/** @author გიორგი თოდუა */
package homework7;

public class PartTime extends Employee{
    double hourlyRate;
    double hoursWorked;

    public PartTime(String name, double hourlyRate,double hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public static void main(String[] args) {
        Employee[] team = {
                new FullTime("Anna", 5000),
                new PartTime("Beka", 25, 80) };
        for (Employee e : team) {
            e.printInfo(); System.out.println(e.calculateSalary());
        }
    }
}
