class Solution {
    int[][] grid;
    int row;
    int col;
    boolean isValid(int i , int j){
        return(i>=0 && i<row && j>=0 && j<col && grid[i][j]==0);
    }
    int[][] memo;
    public int uniquePathsWithObstacles(int[][] grid) {
        row = grid.length;
        col=grid[0].length;
        this.grid=grid;
        memo = new int[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(memo[i],-1);

        }
        return dfs(0,0);
    }
    int dfs(int i,int j){
        if(!isValid(i,j)){
            return 0;
        }
        if(i==row-1 && j==col-1){
            return 1;
        }
        if(memo[i][j] !=-1){
            return memo[i][j];
        }
        return memo[i][j]=dfs(i+1,j)+dfs(i,j+1);
    }
}
