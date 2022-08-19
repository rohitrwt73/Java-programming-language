import java.util.*;
public class chocolate {
    public static int find(int arr[] , int n, int m){
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i<= n - m ; i++){
            int minw = arr[i];
            int maxw = arr[i+m-1];
            int gap = maxw -minw;
            if(gap < ans){
                ans = gap;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,9,56,7,9,12};
        int n = arr.length;
        int m=5;
        System.out.println(find(arr,n,m));
    }
    
}
