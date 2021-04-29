
public class Lab11 {
	public static void question1(int[] arr) {
		for(int i = arr.length;i>=0;i--) {
			for(int j = 0;j<i;j++) {
				System.out.print(arr[i-j-1]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void question2(int[] arr) {
		for(int i = arr.length;i>=0;i--) {
			for(int j = 0;j<=i-1;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void question3() {
		int[] arr = new int[10];
		for(int i=0;i<10;i++){
			arr[i]=(i+1)*5;
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		System.out.println("Method 1:");
		question1(arr1);
		System.out.println("Method 2:");
		question2(arr1);
		System.out.println("Method 3:");
		question3();

	}
}
