import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.println("Please enter your age:");
		int age = new Scanner(System.in).nextInt();
		System.out.println("My age is " + age);
		System.out.println("Twice my age is " + (age*2));
		System.out.println("Three times my age is " + (age*3));
		System.out.println("Half of my age is "+ (age/2.0));

	}
}
