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
    static Boolean isSafe(Boolean  board[][],int row,int col){
        // Check vertical
        for (int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        // Left Diagonal
        int maxLeft=Math.max(row,col);
        for (int i=0;i<maxLeft;i++){
            if(board[row--][col--]){
                return false;
            }
        }
        //Right Diagonal
        int maxRight=Math.max(row,board.length-col-1);
        for(int i=0;i<maxRight;i++){
            if(board[row-1][col+1]){
                return false;
            }
        }
        
        return true;
    }

    static void display(Boolean board [][]){
        for(Boolean []row:board){
            for(Boolean col:row){
                if(col){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
        }
        System.out.println();
    }
 
}
