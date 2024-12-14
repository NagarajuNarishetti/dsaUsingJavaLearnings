public class Pattern{
    public static void main(String [] args){
        pattern(5);
    }
    public static void pattern(int n){
    //  helper(n, n);
    helper(n, 0);
    }
    public  static void helper(int n,int c){
        // if (n == 0) {
        //     return; // Base case: Stop recursion when `n` reaches 0
        // }

        // if (c > 0) {
        //     System.out.print(" *"); // Print stars for the current row
        //     helper(n, c - 1); // Continue printing the current row
        // } else {
        //     System.out.println(); // Move to the next row
        //     helper(n - 1, n - 1); // Reset column counter and go to the next row
        // }
        if(n==0){
            return ;
        }
        if(c<n) {
            System.out.print(" *");
            helper(n, c+1);  
        }
        else{
            System.out.println();
            helper(n-1,0);
        }
    }
}