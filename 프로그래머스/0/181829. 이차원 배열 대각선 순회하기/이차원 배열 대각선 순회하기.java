class Solution {
    public int solution(int[][] board, int k) {
        
        int answer = 0;
        
            for(int i=0;i<board.length;i++){
                if( k>=0 && k<(board.length)+(board[i].length) )
                {                
                    for(int j=0;j<board[i].length;j++){
                        if(i+j<=k){
                            answer+=board[i][j];    
                    }
                }

                    
                    
                }
            }
        
        return answer;
    }
}