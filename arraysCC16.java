public class arraysCC16 {
    public static int diagonalSum(int matrix[][]){
        int sum =0;
        for(int i=0; i< matrix.length;i++){
           
                sum+= matrix[i][i];
                if(i != matrix.length-1-i)
                  sum+= matrix[i][matrix.length-1-i];
                
            
        }
        return sum;
    }
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(col >=0 && row<= matrix.length){
            if(key == matrix[row][col]){
                System.out.println("key is found at ("+ row + "," + col + ")");
                return true;
            }
            else if(key <  matrix[row][col]){
                col--;     //move left
            }
            else {
                row++;    //move down

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8}, 
                       {9,10,11,12},
                      {13,14,15,16}};
                      int key =9;
        staircaseSearch(matrix,key);
    }
    
}
