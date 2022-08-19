public class arraysSol3 {
    public static int trappedRainWater(int heights[]){
        int n =heights.length;
        int leftMax[]= new int [n];
        leftMax[0]= heights[0];
        for (int i =1 ;i < n ;i++){
            leftMax [i]=Math.max (leftMax[i-1],heights[i]);
        }
        int rightMax [] = new int [n];
        rightMax[n-1] = heights[n-1];
        for (int i =n-2 ;i >=0 ;i--){
            rightMax [i]=Math.max (rightMax[i+1],heights[i]); 
         } int rainWater =0;
         for ( int i=0; i<n;i++){
            int waterLevel =Math.min(leftMax[i],rightMax[i]);
           rainWater += waterLevel - heights[i];
         }
        
        return rainWater;
         }
         public static void main(String[] args) {
            int heights[] = {0,1,0,2,1,0,1,3,2,1,2,1};
            System.out.println("The total rainwater trapped is : "  + trappedRainWater(heights));
         }
}