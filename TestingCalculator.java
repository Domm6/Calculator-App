import java.nio.file.WatchEvent;
import java.util.Scanner;

public class TestingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What action would you like to take? ");
        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n5 - Use Modulo\n6 - Use e Exponents\n7 - Use Logarithim\n8 - Use Trig Function");
        calcAction();
        System.out.println("Would you like to to perform any other calculations?");
        System.out.println("1 - Yes\n2 - No ");

        while (scanner.nextInt() == 1) {
            System.out.println("\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n5 - Use Modulo\n6 - Use e Exponents\n7 - Use Logarithim\n8 - Use Trig Function");
            calcAction();
            System.out.println("Would you like to to perform any other calculations?");
        }

        System.out.println("Thank you! You are now done.");
    }

    public static void calcAction () {
        BasicCalculator basicCalc = new BasicCalculator();
        ScientificCalculator scientificCalc = new ScientificCalculator();
        TrigonometricCalculator trigCalc = new TrigonometricCalculator();
        Scanner scanner = new Scanner(System.in);        
        int action = scanner.nextInt();
        double first;
        double second;

        try {
            if (action == 1){
                System.out.println("What numbers would you like to add? ");
                System.out.print("First Number: ");
                first = scanner.nextInt();
                System.out.print("Second Number: ");
                second = scanner.nextInt();
                System.out.println("Answer: " + basicCalc.Add(first, second));       
            } else if (action == 2){
                System.out.println("What numbers would you like to subract? ");
                System.out.print("First Number: ");
                first = scanner.nextInt();
                System.out.print("Second Number: ");
                second = scanner.nextInt();
                System.out.println("Answer: " + basicCalc.Subtract(first, second));       
            } else if (action == 3){
                System.out.println("What numbers would you like to multiply? ");
                System.out.print("First Number: ");
                first = scanner.nextInt();
                System.out.print("Second Number: ");
                second = scanner.nextInt();
                System.out.println("Answer: " + basicCalc.multiply(first, second));            
            } else if (action == 4){
                System.out.println("What numbers would you like to dvide? ");
                System.out.print("First Number: ");
                first = scanner.nextInt();
                System.out.print("Second Number: ");
                second = scanner.nextInt();
                System.out.println("Answer: " + basicCalc.divide(first, second));       
            } else if (action == 5){
                System.out.println("What numbers would you like to modulo? ");
                System.out.print("First Number: ");
                first = scanner.nextInt();
                System.out.print("Second Number: ");
                second = scanner.nextInt();
                System.out.println("Answer: " + basicCalc.modulo(first, second));       
            } else if (action == 6){
                System.out.println("What number would you like to use e exponents? ");
                System.out.print("Number: ");
                first = scanner.nextInt();
                System.out.println("Answer: " + scientificCalc.Exp(first));       
            } else if (action == 7){
                System.out.println("What number would you like to use the logarithim fuction on? ");
                System.out.print("Number: ");
                first = scanner.nextInt();
                System.out.println("Answer: " + scientificCalc.Log(first));           
            } else if (action == 8){
                System.out.println("What trigonometric functions would you like to use? ");
                System.out.println("1 - Sine\n2 - Cosine\n3 - Tangent\n4 - Arcsine\n5 - Use Arccosine\n6 - Use e Arctangent");

                int trigFunction = scanner.nextInt();
                if (trigFunction == 1){
                    System.out.println("What number would you like to use sine on? ");
                    System.out.print("Number: ");
                    first = scanner.nextInt();
                    System.out.println("Answer: " + trigCalc.Sine(first));  
                } else if (trigFunction == 2) {
                    System.out.println("What number would you like to use cosine on? ");
                    System.out.print("Number: ");
                    first = scanner.nextInt();
                    System.out.println("Answer: " + trigCalc.Cosine(first));  
                } else if (trigFunction == 3) {
                    System.out.println("What number would you like to use tangent on? ");
                    System.out.print("Number: ");
                    first = scanner.nextInt();
                    System.out.println("Answer: " + trigCalc.Tangent(first));  
                } else if (trigFunction == 4) {
                    System.out.println("What number would you like to use arcsine on? ");
                    System.out.print("Number: ");
                    first = scanner.nextInt();
                    System.out.println("Answer: " + trigCalc.Arcsine(first));  
                } else if (trigFunction == 5) {
                    System.out.println("What number would you like to use arccosine on? ");
                    System.out.print("Number: ");
                    first = scanner.nextInt();
                    System.out.println("Answer: " + trigCalc.Arccosine(first));  
                } else if (trigFunction == 6) {
                    System.out.println("What number would you like to use arctangent on? ");
                    System.out.print("Number: ");
                    first = scanner.nextInt();
                    System.out.println("Answer: " + trigCalc.Arctangent(first));
                } else {
                    System.out.println("Please enter a valid number.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                calcAction();
            }
                
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } 

    }
}
