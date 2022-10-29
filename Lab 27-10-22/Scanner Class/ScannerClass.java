package Lab;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String str = sc.nextLine();
		
		System.out.print("Enter your Id: ");  
		int n = sc.nextInt();
		
		System.out.print("Enter your Salary: ");
		double d = sc.nextDouble();
		
		System.out.print("Do u have a car?:(True/False) "); 
		boolean bn = sc.nextBoolean(); 
		
		
		System.out.println("Name:"+str);
		System.out.println("ID: "+n);
        System.out.println("Salary: "+d); 
        System.out.println("Do u have a car:"+bn);
        
        sc.close();
        
	}

}
