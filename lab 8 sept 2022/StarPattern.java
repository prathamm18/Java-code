import java.util.Scanner;
class StarPattern
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int lines = scan.nextInt();

		for(int i=1; i <= lines; i++) {
			// Inner loop
        		for(int j = 1; j <= lines; j++) {
            			if((j == lines - i + 1) || i == j) {
                			System.out.print("*");
            			}
            			else {
                			System.out.print(" ");
            			}
        		}
        		System.out.println("");
    		}
	}
}