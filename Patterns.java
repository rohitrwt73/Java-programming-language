public class Patterns {
    public static void hollow_rec(int totRows, int totCols) {
        for( int i=1; i<=totRows; i++){
            //inner col
            for (int j=1; j<=totCols; j++){
                // cell(i,j)
                if(i==1 || i ==totRows ||j ==1|| j==totCols) {
                    System.out.print("*");
                }
                    else{
                        System.out.print(" ");
                    }
                
            }
            System.out.println();
        }
    }
        public static void inver_half_pyramid(int n){
            for (int i =1;i<=n; i++){
                //spaces
                for(int j =1; j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void inver_half_pyram_num (int n){
            for(int i = 1; i <=n;i++){
                for (int j=1; j<=n-i+1;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            
        } 
        public static void floyds_triangle(int n){
            int counter =1;
            //outer
            for(int i =1; i<=n; i++){
                //how many times counter is printed
                for (int j =1; j<=i;j++){
                    System.out.print(counter +" ");
                    counter++;
                }
                System.out.println();
            }
        } public static void zero_one_triangle(int n){
            for(int i=1; i<= n; i++){
                for (int j =1; j<=i; j++){
                    if ( (i+j)% 2 ==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");

                    }
                }
                System.out.println();
            }
        }
        public static void butterfly (int n){
            //outer loop
            //first half
            for (int i =1;i<=n; i++){
            //star-i
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            //space-2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star-i
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
    }
     
            //2nd half
            for (int i =n;i>=1; i--){
                //star-i
                for(int j=1;j<=i; j++){
                    System.out.print("*");
                }
                //space-2*(n-i)
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                //star-i
                for(int j=1;j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
        }
        }
        public static void solid_rhom(int n){
            for(int i=1; i<=n; i++){
                for (int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=n; j++){
                    System.out.print("*");
                } System.out.println();
            }
        }
        public static void hollow_rhom (int n){
            for (int i = 1; i<=n;i++){
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //hollow rectangle is tilted here (stars)
                for(int j=1; j<=n;j++){
                    if (i==1|| i==n ||j==1||j==n) {
                        System.out.print("*");
                        
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println();
            }
        }
        public static void diamond(int n) {
            //upper half
            for (int i =1; i<=n; i++){
                //spaces
                for(int j = 1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i =n; i>=1; i--){
                //spaces
                for(int j = 1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }

           public static void main(String[] args) {
            diamond(4);
        
    }
    
    
    
}
