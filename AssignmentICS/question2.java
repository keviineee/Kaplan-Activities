import java.util.*;

public class question2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double propertyAnnualValue, annualPropertyTax = 0;
        try {
            System.out.print("What is Property's Annual Value?: ");
            propertyAnnualValue = sc.nextDouble();

            if (propertyAnnualValue < 0) {
                System.out.println("Invalid Property Value");
            } else if (propertyAnnualValue < 8000) {
                annualPropertyTax = 0;
            } else if (propertyAnnualValue < 55000) {
                annualPropertyTax = propertyAnnualValue * 0.04;
            } else if (propertyAnnualValue < 100000) {
                annualPropertyTax = propertyAnnualValue * 0.08;
            } else {
                annualPropertyTax = propertyAnnualValue * 0.12;
            }

            System.out.println("Your Annual Property Tax is " + annualPropertyTax);
        } catch (InputMismatchException e) {
            System.out.println("Wrong Input.");
        }
        
    }
}
