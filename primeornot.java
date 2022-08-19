public class primeornot {
    
    public static boolean isPrime (int n){
        boolean isPrime = true;
        if(n==2){
         return true;
       }

       // for(int i =2;i<=(n-1);i++){
         //   if (n%i==0){
        //        isPrime= false;
         //       break;
        //    }
       //  } return isPrime;
       for(int i=2;i<=Math.sqrt(n);i++) { //optimized form
        if (n%i==0){
            isPrime = false;
            
        }
       }
       return isPrime;
            
        
    }
    public static void primesInRange(int n){
        for (int i =2;i<=n;i++){
            if (isPrime(i)){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primesInRange(20); //2 to 20
    }
}
