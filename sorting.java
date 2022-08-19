//import java.util.Arrays; //remove this if you need to do sorting by particular method,this is inbuilt sorting 
//mport java.util.Collections; //similar to inbuilt sorting in descending order
import java.util.*;
public class sorting {
    public static void printArr(Integer arr[]){
        int n = arr.length;
        for(int i = 0; i<n ;i++){
            System.out.print(arr [i] + " ");
        }System.out.println();
    }
    public static void bubbleSort(Integer arr[]){ //no need to write this function whenever inbuilt sorting is used
        //bubble sort
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j = 0;j< n-1-i;j++){
                  if(arr[j] >arr[j+1]){    //on changing ">" to "<" it will change to descending order
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void selectionSort(Integer arr[]){ //no need to write this function whenever inbuilt sorting is used
      int n =arr.length;
       for (int i =0;i<n-1;i++){
        int minValue = i;
        for (int j = i+1;j<n;j++){
            if(arr[minValue] >arr[j]){ //on changing ">" to "<" it will change to descending order
                //swap
                int temp =arr[j];
                arr[j]=arr[minValue];
                arr [minValue]=temp;
            }
        }
       }
    }
    public static void insertionSort(Integer arr[]){ //no need to write this function whenever inbuilt sorting is used
        int n = arr.length;
        for(int i =1;i<n;i++){
            int curr = arr[i];
            int j =i-1;
            while(j>=0 && curr <arr[j] ){ //on changing "<" to ">" it will change to descending order
                arr [j+1] = arr[j];
                j--;
            }
            //insertion
            arr[j+1] = curr;
        }
    }
  public static void countSort(Integer arr[]){
    int n = arr.length;
      int largest= Integer.MIN_VALUE;
      for(int i =0; i<n;i++){
        largest= Math.max (largest,arr[i]);
      }
      int count[]= new int[largest+1];
      
      for(int i=0; i< count.length;i++){
       
        count[arr[i]] ++;
      }
      //sorting
      int j =0;
      for(int i =0 ; i< count.length; i++){
        while(count [i]>0){
            arr [j] =i;
            j++;
            count [i]--;

        }
      }
  }
    
    public static void main(String[] args) {
     Integer arr[]={1,4,1,3,2,4,3,7};
     countSort(arr);
   // Arrays.sort(arr); //inbuilt sorting
    //Arrays.sort(arr,Collections.reverseOrder()); //for decreasing order
     printArr(arr);
    }
}
