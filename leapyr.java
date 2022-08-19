import java.util.*;
public class leapyr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year : ");
        int a =sc.nextInt();
        boolean x=(a%4)==0;
        boolean y=((a%100)==0 ) && ((a%400)==0);
       

        
        if (x && y) {
            System.out.print("It is a leap year.");
            
            
        } else {
            System.out.print("It is  not a leap year.");
        }
    }
}
