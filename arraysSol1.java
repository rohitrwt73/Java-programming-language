public class arraysSol1 {
    public static boolean containDuplicate(int nums[]){
        for(int i = 0;i<nums.length -1;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        } return false;
    }
    public static void main(String[] args) {
        int nims[]={1,2,3,4,5};
    System.out.println(containDuplicate(nims)); 
    }
    
}
