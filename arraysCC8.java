public class arraysCC8 {
    public static void printMaxSum (int numbers[]){
        int maxSum =Integer.MIN_VALUE;
        int currSum=0;
        for (int i =0; i<numbers.length; i++){
            int start = i;
            for(int j =i; j<numbers.length; j++){
                int end = j;
                for(int k=start;k<=end;k++){ //print array sum
                    currSum+= numbers[k];
                    }
                    System.out.println(currSum);
                    if(maxSum<currSum) {
                        maxSum= currSum;
                    }
                    
                }
                
            }
            System.out.println("The max sum is :" + maxSum);
                
            
        }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printMaxSum(numbers);
    }
    
}
