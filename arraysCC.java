import java.util.*;
public class arraysCC {
    public static void main(String[] args) {
        int marks []= new int[100];
        System.out.println("The length of array is : "+ marks.length); //to know length of an array 
       Scanner sc = new Scanner(System.in);
       marks[0]=sc.nextInt();
       marks[1]=sc.nextInt();
       marks[2]=sc.nextInt();
       System.out.println("Maths : "+ marks[0]);
       System.out.println("Physics : "+ marks[1]);
       System.out.println("Chemistry : "+ marks[2]);
      // marks[0]=marks[0]+4; //increase marks by any value
       //System.out.println("Maths : "+ marks[0]); 
       marks[0] =97; //update marks to particular value
       System.out.println("Maths : "+ marks[0]);

    }
    
}
