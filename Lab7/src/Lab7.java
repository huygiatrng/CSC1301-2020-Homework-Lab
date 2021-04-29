import java.util.Scanner;
public class Lab7 {
	//methods
	public static boolean isVowel(char ch ) {
   	 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            return true;
   	 }else{
            return false;
   	 }
   }
   public static boolean isConsonant(char ch) {
   	if (isVowel(ch)==true) {
   		return false;
   	}else {
   		return true;
   	}
   }
   
   public static char changeCase(char ch) {
   	int chU = (int) ch;
   	int chU2;
   	if (chU >=65&&chU<=90) {
   		chU2 = chU +32;
   	}else{
   		chU2 = chU -32;
   	}
   	
   	char ch2=(char)chU2;
   	return ch2;
   }
   
   
   //main
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);    			;
        char ch = input.next().charAt(0);
        
       if(isVowel(ch)==true) {
    	   System.out.println(ch + " is vowel");
       }else {
    	   System.out.println(ch + " isn't vowell");
       }
       
       if(isConsonant(ch)==true) {
    	   System.out.println(ch + " is consonant");
       }else {
    	   System.out.println(ch + " isn't consonant");
       }
       
       System.out.println(ch + " is equivalent to " +changeCase(ch));
       
    }
    
    
    
    
    
}
