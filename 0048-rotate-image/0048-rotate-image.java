class Solution {
    public void rotate(int[][] matrix) {
       transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            int j=0;
            int k=matrix[i].length-1;
            while(j<k){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][k];
                matrix[i][k]= temp;
                j++;
                k--;
            }
        }
        
    }
   
    void transpose(int[][] mx){
        for(int i=0;i<mx.length;i++){
            for(int j=i+1;j<mx[i].length;j++){
                int temp= mx[i][j];
                mx[i][j]=mx[j][i];
                mx[j][i]= temp;
            }
        }
    }
    
}