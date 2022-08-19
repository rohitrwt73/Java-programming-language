public class palindromicpattern {
    public static void main(String[] args) {
        numPyramid (5);
       
    }
    public static void numPyramid (int n){
        //outer loop 
        for (int i= 1; i<=n; i++){
            // spaces
        for (int j=1; j<= n-i;j++){
            System.out.print (" ");
        }
        //descending number
        for (int j=i; j>=1;j--){
            System.out.print(j);
        }
        //ascending number
        for (int j=2; j<=i; j++){
        System.out.print(j);
        }
        System.out.println();
    }
    
}
}