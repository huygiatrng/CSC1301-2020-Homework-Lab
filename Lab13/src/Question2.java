import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class Question2 {
	public static void main(String[] args) {
		Path file = Paths.get("directory/directory.txt");

        String str = "";
        String name="",number="";
        
        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            
            str = reader.readLine();
            while(str != null){
                display(str);
                str=reader.readLine();
            }
            reader.close();

        }catch(Exception e){
            System.out.println("Error:"+e);
        }
    }   
    public static void display(String str) {
        
        String name,number;
        name=str.substring(0,str.indexOf(" "));
        str=str.substring((str.indexOf(" ")+1),str.length());
        number =str;
        System.out.println(name+" "+number);
        
    }

}
