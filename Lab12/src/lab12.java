import java.util.Scanner;

public class lab12 {
	
	public static int[] createArray(int a, int b) {
		//Create array base on a and b
		int max, min;
		if(a>b) {
			max = a;
			min = b;
			int lengthOfArray = max-min+1;
			
			int[] intArray = new int[(lengthOfArray)];
			
			for(int i = 0;i<=(lengthOfArray-1);i++) {
				intArray[i] = max - i;
				
			}
			return intArray;
		}else{
			max = b;
			min = a;
			int lengthOfArray = max-min+1;
			
			int[] intArray = new int[(lengthOfArray)];
			
			for(int i = 0;i<=(lengthOfArray-1);i++) {
				intArray[i] = min + i;
				
			}
			return intArray;
		}
		
	}
	public static double average(int[] arr) {
		//Calculate and return average of number of array
		int sum = 0;
		for(int i =0; i<arr.length;i++){
			sum+= arr[i];
		}
		
		double average = sum / (arr.length);
		return average;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int[] arr = createArray(a,b);
		System.out.print("Array is [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		double avr = average(arr);
		System.out.print("Average: "+avr);
		
	}
}
