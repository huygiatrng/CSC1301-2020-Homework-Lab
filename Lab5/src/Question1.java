
public class Question1 {
	public static void main(String[] args) {
		createLine();
		createTop();
		createLine();
		createBottom();
		createLine();
	
	}
	public static void createLine() {
		System.out.println("+---------+");
	}
	public static void createTop() {
		System.out.println("|    *    |\r\n" + 
				"|   /*\\   | \n" + 
				"|  //*\\\\  |\n" + 
				"| ///*\\\\\\ |\n" + 
				"| \\\\\\*/// |\n" + 
				"|  \\\\*//  |\n" + 
				"|   \\*/   |\n" + 
				"|    *    |");
	}
	public static void createBottom() {
		System.out.println("| \\\\\\*/// |\n" + 
				"|  \\\\*//  |\n" + 
				"|   \\*/   |\n" + 
				"|    *    |\n" + 
				"|    *    |\n" + 
				"|   /*\\   |\n" + 
				"|  //*\\\\  |\n" + 
				"| ///*\\\\\\ |");
	}
}
