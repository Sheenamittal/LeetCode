class Solution {
    public String tictactoe(int[][] moves) {
        var comb = new short[16];
        for (int i = 0; i < moves.length; i++) {
            int offset = (8 * (i % 2));
            var move = moves[i];
            if (++comb[move[0] + offset] == 3 
                    || ++comb[3 + move[1] + offset] == 3 
                    || (move[0] == move[1] && ++comb[6 + offset] == 3) 
                    || (move[0] + move[1] == 2 && ++comb[7 + offset] == 3)) {
                return (i % 2) == 0 ? "A" : "B";
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
