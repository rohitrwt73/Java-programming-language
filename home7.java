import java.util.*;
public class home7 {
    public static void main(String args[]){
    System.out.print("Please enter a number :");
    Scanner sc = new Scanner (System.in);
    int palindrome =sc.nextInt();
    if (isPalindrome(palindrome)){
        System.out.print("Number:"+ palindrome + "is a palindrome.");   
    }
    else {  System.out.print("Number:"+ palindrome + "is not a palindrome.");
}
    }
    public static boolean isPalindrome(int n) {
     int palindrome = n;
     int rev =0;
     while(palindrome!= 0){
    int rem =palindrome % 10;
    rev = rev* 10+rem;
    palindrome /=10;

     }
    
    if (n==rev){
        return true;
     } else {
        return false;
     }
    
    }
}
