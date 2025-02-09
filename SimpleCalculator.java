import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();

        double secondNumber = scanner.nextDouble();

        double difference = firstNumber - secondNumber;
        double quotient = firstNumber / secondNumber;

        quotient = firstNumber / secondNumber;
        if (secondNumber !=0) {
             // division } else {
        double remainder = firstNumber % secondNumber; // remainder 
        // Print the results 
        double sum = firstNumber + secondNumber;
        System.out.printf("Sum: %.2f%n", sum);
        }
        double remainder = firstNumber % secondNumber; // remainder // Print the results System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        // Close the scanner 
        scanner.close();
        if (secondNumber !=0) {
            System.out.printf("Quotient: %.2f%n", quotient);
        }
        System.out.printf("Remainder: %.2f%n", remainder);
        // Close the scanner scanner.close();
    }
}