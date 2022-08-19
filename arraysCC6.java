public class arraysCC6 {
    public static void printPairs (int numbers[]){
        int tp =0;
        for (int i =0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j =i+1; j<numbers.length; j++){
                int next = numbers[j];
                System.out.print("("+ curr +"," +next +")");
                tp++;
                
                
            }System.out.println();
        }System.out.println("Total pairs : "+ tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
    
}
