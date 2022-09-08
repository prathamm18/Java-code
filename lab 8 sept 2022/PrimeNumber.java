import java.util.Scanner;
class PrimeNumber
{
   public static void main(String[] args)
   {
      int num, i=2, b=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      
      while(i<num)
      {
         if(num%i == 0)
         {
            b++;
            break;
         }
         i++;
      }
      
      if(b==0)
         System.out.println(num+ " is a Prime Number.");
      else
         System.out.println(num+ " is not a Prime Number.");
   }
}
