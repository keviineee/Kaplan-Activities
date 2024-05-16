import java.util.Scanner;
import java.io.*;

public class question3 {
    public static void main(String[] args) throws Exception{
        System.out.println(System.getProperty("user.dir"));
        Scanner sc = new Scanner(new File("C:\\Users\\User\\OneDrive\\Desktop\\employeefile.txt"));
        String employeeID, employeeName, description;
        int performanceRating;
        double employeeSalary, bonus, revisedSalary;
        System.out.println("ID\t Name\t Salary\t Bonus\t New Salary\t Description");
        while (sc.hasNext()) {
            employeeID = sc.next();
            employeeName = sc.next();
            employeeSalary = sc.nextDouble();
            performanceRating = sc.nextInt();
            
            if (performanceRating == 1) {
                bonus = employeeSalary * 0.5;
                revisedSalary = employeeSalary + (employeeSalary * 0.02);
                description = "Require Improvement";
            }
            else if (performanceRating == 2) {
                bonus = employeeSalary * 1;
                revisedSalary = employeeSalary + (employeeSalary * 0.05);
                description = "Achieved";
            }
            else if (performanceRating == 3) {
                bonus = employeeSalary * 1.5;
                revisedSalary = employeeSalary + (employeeSalary * 0.08);
                description = "Exceed";
            }
            else {
                bonus = 0;
                revisedSalary = 0;
                description = "Invalid Rating";
            }
            
            System.out.println(employeeID + "\t" + employeeName + "\t" +employeeSalary + "\t" +bonus + "\t"+  revisedSalary +"\t\t"  + description);
        }
    }
}
