public class arraysSol2 {
    public static int Buysell(int prices[]){
        int maxProfit =0;
        int buyPrice=prices[0];
        int n = prices.length;
        for (int i =1;i< n;i++){
            if (buyPrice<prices[i]){
                int profit= prices[i] - buyPrice;
                maxProfit = Math.max (profit,maxProfit);
            }
            else{
                buyPrice = prices[i];
            }
        } return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4};
       System.out.println(Buysell(prices)); 
    }
}
