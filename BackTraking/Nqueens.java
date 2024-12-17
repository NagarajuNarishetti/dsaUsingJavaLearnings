package BackTraking;

public class Nqueens {
    public static void main(String [] args){
        int n=4;
        Boolean [][] board= new Boolean[n][n];
        System.out.println(nqeens(board,0));
    }

    static int nqeens(Boolean board[][],int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1; 
        }

        int count=0;

        for(int c=0;c<board.length;c++){
            if(isSafe(board,row,c)){
                board[row][c]=true;
                count+=nqeens(board, row+1);
                board[row][c]=false;
            }
        }
        return count;
    }

    static 
}
