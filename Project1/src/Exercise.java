import java.util.Scanner;

public class Exercise {
    public static void Main(String[] args) {
        //Exercise 1
        Scanner input = new Scanner(System.in);
        System.out.println("BMI calculator");
        System.out.println("Please enter your weight in kilograms");
        double weight = input.nextDouble();
        System.out.println("Please enter your height in meters");
        double height = input.nextDouble();

        double bmi = weight / Math.sqrt(height);

    }
}
