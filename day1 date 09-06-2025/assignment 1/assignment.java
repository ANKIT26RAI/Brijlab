
// 1. Welcome to Bridgelabz!
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        // Display a greeting message
        System.out.println("Hello! Let's do some calculations.");

        Scanner input = new Scanner(System.in);

        // Adding two integers
        System.out.print("Input first integer: ");
        int first = input.nextInt();
        System.out.print("Input second integer: ");
        int second = input.nextInt();
        int total = first + second;
        System.out.println("The sum is: " + total);

        // Converting Celsius to Fahrenheit
        System.out.print("Input temperature in Celsius: ");
        double tempCelsius = input.nextDouble();
        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
        System.out.println("Converted to Fahrenheit: " + tempFahrenheit);

        // Area calculation of a circle
        System.out.print("Input the radius of a circle: ");
        double r = input.nextDouble();
        double circleArea = Math.PI * r * r;
        System.out.println("Circle area: " + circleArea);

        // Volume of a cylinder
        System.out.print("Input cylinder radius: ");
        double cylR = input.nextDouble();
        System.out.print("Input cylinder height: ");
        double cylH = input.nextDouble();
        double cylVolume = Math.PI * cylR * cylR * cylH;
        System.out.println("Cylinder volume: " + cylVolume);

        // --- Additional Calculations ---

        // Simple Interest Formula
        System.out.print("Enter amount: ");
        double amt = input.nextDouble();
        System.out.print("Enter annual rate (%): ");
        double interestRate = input.nextDouble();
        System.out.print("Enter time (years): ");
        double duration = input.nextDouble();
        double interest = (amt * interestRate * duration) / 100;
        System.out.println("Simple Interest is: " + interest);

        // Perimeter of rectangle
        System.out.print("Enter rectangle length: ");
        double len = input.nextDouble();
        System.out.print("Enter rectangle width: ");
        double wid = input.nextDouble();
        double peri = 2 * (len + wid);
        System.out.println("Perimeter: " + peri);

        // Power operation
        System.out.print("Enter base value: ");
        double baseVal = input.nextDouble();
        System.out.print("Enter exponent value: ");
        double exp = input.nextDouble();
        double result = Math.pow(baseVal, exp);
        System.out.println("Power result: " + result);

        // Average of three values
        System.out.print("Input 1st number: ");
        double x = input.nextDouble();
        System.out.print("Input 2nd number: ");
        double y = input.nextDouble();
        System.out.print("Input 3rd number: ");
        double z = input.nextDouble();
        double avg = (x + y + z) / 3;
        System.out.println("Average value: " + avg);

        // Kilometers to miles conversion
        System.out.print("Enter distance in KM: ");
        double km = input.nextDouble();
        double mi = km * 0.621371;
        System.out.println("Equivalent in miles: " + mi);

        input.close();
    }
}
