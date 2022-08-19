public class home6 {
    public static boolean isEven (int n) {
        boolean isEven = true;
        if (n==1){
            isEven =false;
        }
        
        for ( int i =2 ; i<=Math.sqrt(n);i++) {
            if (n % 2 !=0) {
                isEven = false;
            }
            
        }
        return isEven;
    }
    public static void main(String args[]){
    System.out.println(isEven(87));
    }
}
