/** @author გიორგი თოდუა */

package homework7;

public class Circle implements Shape {
    private double  r;

    public Circle(double r){
        this.r=r;
    }


    @Override
    public double area() {
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
       Shape s1 = new Rectangle(4,5);
       Shape s2 = new Circle(3);

       System.out.println(s1.area());
       System.out.println(s2.area());
    }
}


