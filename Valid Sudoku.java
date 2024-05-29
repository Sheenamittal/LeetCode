class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] visited = new boolean[13];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
            if(visited[board[i][j]-46]){
                return false;
            }
            else if(board[i][j] !='.'){
                visited[board[i][j]-46] = true;
            }
        }
        visited = new boolean[13];
    }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(visited[board[j][i]-46]){
                    return false;
                }
                else if(board[j][i]!='.'){
                    visited[board[j][i]-46]=true;
                }
            }
            visited = new boolean[13];
        }
        int m=0,n=0;
        while(true){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(visited[board[m+i][n+j]-46]){
                        return false;
                    }
                    else if(board[m+i][n+j]!='.'){
                        visited[board[m+i][n+j]-46]=true;
                    }
                }
            }
            if(n==6 && m==6) break;

            if(m==6){
                n+=3;
                m=0;
            }
            else{
                m+=3;
            }
            visited = new boolean[13];
        }
        return true;

    }
}
