import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input first number:");
		double num1 = input.nextDouble();
		System.out.print("Please input second number:");
		double num2 = input.nextDouble();
		System.out.println(calculateAverage(num1,num2));
	}
	public static double calculateAverage(double num1, double num2) {
		double average = (num1 + num2)/2;
		return average;
	}
}
