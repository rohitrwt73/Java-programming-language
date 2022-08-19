import java.util.*;
public class inctaxcal {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int income=sc.nextInt();

if (income<=500000){
    System.out.print("Tax=0");
}
    else if (income>=1000000 && income>500000){
        System.out.print("Tax ="+ income*0.2);
    }
        else{
            System.out.print("Tax ="+ income*0.3);
        }
    }
}

    
    

