
// 1. Welcome to Bridgelabz!
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        // 1. Welcome to Bridgelabz!
        System.out.println("Welcome to Bridgelabz!");

        // 2. Add TwoNumbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // 3. Celsius to Fahrenheit Conversion
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // 4. Area of a Circle
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);

        // 5. Volume of a Cylinder
        System.out.print("Enter radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(cylinderRadius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);

        scanner.close();

        // Self Problems

        // 1. Calculate Simple Interest
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // 2. Perimeter of a Rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // 3. Power Calculation
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double powerResult = Math.pow(base, exponent);
        System.out.println("Result of " + base + " raised to " + exponent + ": " + powerResult);

        // 4. Calculate Average of Three Numbers
        System.out.print("Enter first number: ");
        double avgNum1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double avgNum2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double avgNum3 = scanner.nextDouble();
        double average = (avgNum1 + avgNum2 + avgNum3) / 3;
        System.out.println("Average of the three numbers: " + average);

        // 5. Convert Kilometers to Miles
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);

        scanner.close();
    }
}