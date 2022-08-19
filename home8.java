import java.util.*;
public class home8 {
    public static void main(String args[]){
    System.out.print("Please enter a number :");
    Scanner sc = new Scanner (System.in);
    int digits =sc.nextInt();
    
        System.out.print("The number is " +sumDigits(digits)); 
    }  
    
  

    
    public static int sumDigits(int n) {
     
     int sumOfDigits =0;
     while(n>0){
    int lastDigits =n% 10;
    sumOfDigits+=lastDigits;
    n/=10;
    }
    return sumOfDigits;
    
    
     }
    
    }


