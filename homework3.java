import java.util.*;
public class homework3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the day number (1-7) : ");
        int day =sc.nextInt();
        switch (day){
            case 1 : System.out.print( "It is Monday.");
            break;
            case 2 :  System.out.print("It is Tuesday.");
            break;
            case 3 :  System.out.print("It is Wednesday.");
            break;
            case 4 : System.out.print( "It is Thursday.");
            break;
            case 5 : System.out.print( "It is Friday.");
            break;
            case 6 : System.out.print( "It is Saturday.");
            break;
            case 7 : System.out.print( "It is Sunday.");
            break;
            default: System.out.print("Invalid input. Please dial within (1-7)");
        }

    
}}
