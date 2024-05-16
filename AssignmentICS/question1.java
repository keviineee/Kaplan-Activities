
import java.util.*;
import java.util.InputMismatchException;

public class question1 {
    
    public static void main(String[] args) {
        boolean repeat = false;
        
        do {
            Scanner sc = new Scanner(System.in);
            String sizeInput;
            double weightInput;
            double deliveryCharge;

            System.out.println("Welcome to Delivery Charge Calculator");
            System.out.print("What is your Box Size? (Small,Medium, Large): ");
            sizeInput = sc.nextLine();
            
            String convertedSizeInput = sizeInput.toLowerCase();
            
                if (!sizeInput.equalsIgnoreCase("small") && !sizeInput.equalsIgnoreCase("medium") && !sizeInput.equalsIgnoreCase("large")) {
                        System.out.println("Wrong input. Please input correctly.");
                        repeat = true;
                        System.out.println("------------------------------------");
                }


            switch (convertedSizeInput) {
                case "small": 
                    try {
                        System.out.print("What is the weight of your parcel in kilograms?(Lower than or equal to 5):  ");
                        weightInput = sc.nextDouble();
                   
                        if (weightInput < 3 && weightInput >= 0) {
                            deliveryCharge = 8;
                             System.out.println("Delivery Charge: " + deliveryCharge);
                        repeat = false;
                         } else if (weightInput >= 3 && weightInput <= 5) {
                             deliveryCharge = 12;
                              System.out.println("Delivery Charge: " + deliveryCharge);
                        repeat = false;
                         } else {
                            System.out.println("Your choice of box size is not compatible with the weight.");
                            repeat = true;
                            System.out.println("------------------------------------");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input. Please input a valid number.");
                        repeat = true;
                        System.out.println("------------------------------------");
                    }
                    break;
                    
                case "medium": 
                    try {
                        System.out.print("What is the weight of your parcel in kilograms?(Lower than or equal to 10):  ");
                        weightInput = sc.nextDouble();

                        if (weightInput < 5 && weightInput >= 0) {
                            deliveryCharge = 15;
                            System.out.println("Delivery Charge: " + deliveryCharge);
                            repeat = false;
                        }
                        else if (weightInput >= 5 && weightInput <= 10) {
                            deliveryCharge = 22;
                            System.out.println("Delivery Charge: " + deliveryCharge);
                            repeat = false;
                        }
                        else {
                            System.out.println("Your choice of box size is not compatible with the weight.");
                            repeat = true;
                            System.out.println("------------------------------------");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input. Please input a valid number.");
                        repeat = true;
                        System.out.println("------------------------------------");
                    }
                    break;
                    
                    
                case "large": 
                    try {
                        System.out.print("What is the weight of your parcel in kilograms?(Lower than or equal to 20):  ");
                        weightInput = sc.nextDouble();

                        if (weightInput < 10) {
                            deliveryCharge = 25;
                            System.out.println("Delivery Charge: " + deliveryCharge);
                            repeat = false;
                        }
                        else if (weightInput >= 10 && weightInput <= 20) {
                            deliveryCharge = 35;
                            System.out.println("Delivery Charge: " + deliveryCharge);
                            repeat = false;
                        }
                        else {
                            System.out.println("Your choice of box size is not compatible with the weight.");
                            repeat = true;
                            System.out.println("------------------------------------");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input. Please input a valid number.");
                        repeat = true;
                        System.out.println("------------------------------------");
                    }
                    break;
                     
            }
        }while (repeat);
        
    }
}
