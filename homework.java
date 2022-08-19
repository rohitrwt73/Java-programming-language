import java.util.*;
public class homework {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);//whether no. is +ve or -ve
        System.out.print("Enter a number : = ");
        int no =sc.nextInt();
        String type=(no <0)?"Negative":"Positive";
        System.out.print(type);
    }
}
