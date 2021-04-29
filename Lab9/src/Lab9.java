import java.util.Scanner;

public class Lab9 {
	public static void printStars(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print('*');
		}
		System.out.println("");
	}
	
	public static void Multiples(int n) {
		for(int i=1;i<=10;i++) {
			System.out.print(i*n);
			System.out.print(" ");
		}
		System.out.println("");
	}
	
	
	public static boolean hasAnEvenDigit(int n) {
		
		for(int i=n;i!=0;i=i/10){
			if((i%10)%2==0) {
				return true;
			}
		}
		return false;
	
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter n for question 1:");
		int n1 = input.nextInt();
		printStars(n1);
		
		System.out.print("Please enter n for question 2:");
		int n2 = input.nextInt();
		Multiples(n2);
		
		System.out.print("Please enter n for question 3:");
		int n3 = input.nextInt();
		System.out.print(hasAnEvenDigit(n3));
	}


}
