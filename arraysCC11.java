import java.util.*;
public class arraysCC11 {
    
    public static int buyAndSellStocks (int prices[]) {
        int maxProfit =0;
        int buyPrice= Integer.MAX_VALUE;
        for (int i =0;i<prices.length;i++){
            if(buyPrice <prices[i]){ //profit
            int profit =prices[i]-buyPrice;
            maxProfit = Math.max(maxProfit,profit);
        }else{//loss
        buyPrice = prices[i];
        }
        } return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks (prices));
    }
    
}
