import java.util.Scanner;

class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string :");
        String a= scanner.nextLine();

        if(isPalindrome(a))
        {
            System.out.println(a+" is a palindrome string");
        }
        else
        {
            System.out.println(a +" is not a palindrome string");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}