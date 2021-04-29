import java.util.Scanner;

public class LabExam {

	public static int[] printLarge(int a, int b) {
		int max = 0;
		int min = 0;
		if(a>b) {
			max = a;
			min = b;
		}else if(a<b){
			max = b;
			min =a;			
		}

		int[] arr = new int[(max-min-1)];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = min+(i+1);
		}
		return arr;
	}
	
	public static void printPattern(int number) {
		
		int[] arr = new int[5];
		for(int i = 0; i<=4;i++) {
			arr[i]= number * (i+1);
		}
		System.out.print("Multiples of 4 are stored in an array – [" + number);
		for(int i =1;i<=4;i++) {
			System.out.print(","+arr[i]);
		}
		System.out.println("]");
		
		for(int i = 1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("QUESTION 1:");
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		printPattern(number);
		
		System.out.println("\n\nQUESTION 2:");
		System.out.print("Enter two numbers : ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a==b||a==b+1||b==a+1) {
			System.out.println("You entered invalid numbers.");
		}else{
			int[] result = printLarge(a,b);
			System.out.print("The number between "+a+" and "+b+" are - "+result[0]);
			for(int i = 1;i<result.length;i++) {
				System.out.print(","+result[i]);
			}
		}
		
	}

}
