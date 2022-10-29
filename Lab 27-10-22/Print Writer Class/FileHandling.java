package Lab;
import java.io.PrintWriter;
import java.io.*;

public class FileHandling {
	 public static void main(String[] args) throws IOException {
	        File file = new File("emp.txt");
	        if(file.exists()){
	            file.createNewFile();
	        }
	        PrintWriter p1 = new PrintWriter(file);
	        p1.println("Employee name: - Bhagyashree");
	        p1.println("Employee id: - 06");
	        p1.println("Employee salary - 450000");
	        p1.close();
	        System.out.println("Done");
	        
	    }

}
