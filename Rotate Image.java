class Solution {
    public void rotate(int[][] matrix) {
       for(int row=0;row<matrix.length;row++){
        for(int col=row+1;col<matrix[0].length;col++){
            if(row<col){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
             }
            }
       }    
        for(int k=0;k<matrix.length;k++){
            int left=0,right=matrix.length-1;
            while(left<right){
                int temp=matrix[k][left];
                matrix[k][left]=matrix[k][right];
                matrix[k][right]=temp;
                left++;
                right--;
            }
        }      
    }
}
