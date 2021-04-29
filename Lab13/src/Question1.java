import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;

public class Question1 {
	public static void main(String[] args) {
		Path file = Paths.get("directory/directory.txt");
        
        Scanner input = new Scanner(System.in);
        String name;
        String str="";
        String number;
        final String QUIT = "ZZZ";
        try{
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
            System.out.print("Enter name:");
            name = input.next();

            while(name.equals(QUIT)==false){
                System.out.print("Enter phone number: ");
                number = input.next();
                str = name+" "+number;
                
                writer.write(str,0,str.length());
                writer.newLine();
                
                System.out.print("Enter name or ZZZ to quit: ");
                name = input.next();

            }
            writer.close();
        }catch(Exception e){
        	System.out.print("Error: "+ e);
        }
	}

}
