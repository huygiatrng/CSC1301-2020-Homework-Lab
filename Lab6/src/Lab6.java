import java.util.Scanner;
public class Lab6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("The largest is " + largest(num1,num2,num3));
		System.out.println("The smallest is " + smallest(num1,num2,num3));
		System.out.println("The median is " + median(num1,num2,num3));
		
	}
	public static int largest(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2>num3 && num2 > num3) {
			return  num2;
		} else {
			return num3;
		}
	}
	public static int smallest(int num1, int num2, int num3) {
		int min;
		if (num1<num2) {
			min = num1;
			if(num1 < num3) {
				return min;
			} else {
				min = num3;
				return min;
			}
		} else if (num2 < num3) {
			min = num2;
			return min;
		} else {
			min = num3;
			return min;
		}
	}
			
	public static int median(int num1, int num2, int num3) {
		int average = (num1 + num2 + num3)/3;
		return average;
	}		
}
