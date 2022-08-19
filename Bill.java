import java.util.*;
public class Bill {
    public static void main(String args[]){
try (Scanner sc=new Scanner(System.in)){
float pencil=sc.nextFloat();
float pen=sc.nextFloat();
float eraser=sc.nextFloat();
float total=pencil+pen+eraser;
System.out.print("the bill is:"+total);
//float newTotal=(0.18f*total+total);
//System.out.print("the new bill is:"+newTotal);adding 18 %gst
}
}
}
