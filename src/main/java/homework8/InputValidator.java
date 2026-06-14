/** @author Giorgi Todua */
package homework8;

public class InputValidator {
    public static int processAge(String input)
        throws NumberFormatException, IllegalArgumentException{
        int age = Integer.parseInt(input);
        if (age < 0){
            throw new IllegalArgumentException("ასაკი ვერ იქნება უარყოფითი რიცხვი " + age);
        } return age * 12;
    }
    public static void main(String[] args) {
        String[] tinput = {"26","-26","G.T"};
        for (String input : tinput){
            try {
                System.out.println(processAge(input));
            }catch (NumberFormatException e){
                System.out.println("რიცხვი არ არის");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}