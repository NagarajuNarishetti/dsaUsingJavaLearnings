public class Nqueens {
    public static void main(String [] args){
        int n=8;
        boolean [][] board= new boolean[n][n];
        System.out.println(nqeens(board,0));
    }

    static int nqeens(boolean board[][],int row){
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
    static boolean isSafe(boolean  board[][],int row,int col){
        // Check vertical
        for (int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        // Left Diagonal
        int maxLeft=Math.min(row,col);
        for (int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //Right Diagonal
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        
        return true;
    }

    static void display(boolean board [][]){
        for(boolean []row:board){
            for(boolean col:row){
                if(col){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        
    }
 
}
