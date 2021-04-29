import java.util.Scanner;

public class Question1 {
	public static void printName(String name) {
		int i = 1;
		while(i<=20) {
			System.out.println(name);
			i+=1;
		}
	}
	public static void printAge(int age) {
		int i = 1;
		while(i<=age) {
			System.out.println(i);
			i+=1;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = input.nextLine();
		System.out.print("Enter your age:");
		int age = input.nextInt();
		printName(name);
		printAge(age);	
	}


}
