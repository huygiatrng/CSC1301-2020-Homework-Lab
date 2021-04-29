import java.util.Scanner;

public class Lab10 {
	public static void multi() {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("---------------------------");
		}
	}
	
	public static void triangle() {
		for(int i = 1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int g=1;g<=i;g++) {
				System.out.print(g);
			}
			System.out.println("");
		}
	}
	
	public static String reverse(String original) {
		String str = "";
		for(int i = (original.length()-1);i>=0;i--) {
			str = str+original.charAt(i);
		}
		return str;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question1:");
		multi();
		System.out.println("Question2:");
		triangle();
		System.out.println("Question3: Please enter the string you want to reserve:");
		String str = input.nextLine();		
		System.out.println(reverse(str));	
	}
}
