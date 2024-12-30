/*
 Corrections are there in this

import java.util.*;
public class FractionalKnapSack {
    public static void main(String[]args){
    int [] weights= {30,40,20,60,10};
    Integer[] profits= {20,60,30,80,100};
    int maxWeight=70;
    List<Integer> items=new ArrayList<>();
    
    int mat[][]=new int [weights.length][3];
    for(int i=0;i<weights.length;i++){
        mat[i][0]=i;
        mat[i][1]=weights[i];
        mat[i][2]=profits[i];
    }
    Arrays.sort(mat,Comparator.comparingDouble(o->o[2]/o[1]));
    int cWeight=0;
    int i=0;
    int totalProfit=0;
    while(cWeight<maxWeight && (maxWeight-cWeight>mat[i][1])){
        items.add(mat[i][0]);
        cWeight+=mat[i][1];
        totalProfit+=mat[i][2];
    }
    if(cWeight<maxWeight){
        items.add(mat[i][0]);
        int space=maxWeight-cWeight;
        int profitPerUnit=(mat[i][2]/mat[i][1]);
        totalProfit+=space*profitPerUnit;
    }
    for(i=0;i<weights.length;i++){
        for(int j=0;j<3;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("Weights : "+Arrays.toString(weights));
    System.out.println("Profits : "+Arrays.toString(profits));
    System.out.println("Max Weight: " +maxWeight);
    System.out.println("Seleted : "+items);
    System.out.println("Total Profit : "+totalProfit);
    }
}
 */

 import java.util.*;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int[] weights = {30, 40, 20, 60, 10};
        Integer[] profits = {20, 60, 30, 80, 100};
        int maxWeight = 70;
        List<Integer> items = new ArrayList<>();

        // Matrix to hold index, weight, profit, and profit/weight
        double[][] mat = new double[weights.length][4];
        for (int i = 0; i < weights.length; i++) {
            mat[i][0] = i; // Index
            mat[i][1] = weights[i]; // Weight
            mat[i][2] = profits[i]; // Profit
            mat[i][3] = (double) profits[i] / weights[i]; // Profit per unit weight
        }

        // Sort by profit per unit weight in descending order
        Arrays.sort(mat, (a, b) -> Double.compare(b[3], a[3]));

        int cWeight = 0;
        double totalProfit = 0;
        
        // Add items to knapsack
        for (int i = 0; i < mat.length; i++) {
            if (cWeight + mat[i][1] <= maxWeight) {
                // Add whole item
                items.add((int) mat[i][0]);
                cWeight += mat[i][1];
                totalProfit += mat[i][2];
            } else {
                // Add fractional item
                int remainingWeight = maxWeight - cWeight;
                totalProfit += remainingWeight * mat[i][3];
                items.add((int) mat[i][0]);
                break;
            }
        }

        // Display sorted matrix
        System.out.println("Index\tWeight\tProfit\tProfit/Weight");
        for (double[] row : mat) {
            System.out.printf("%d\t%.0f\t%.0f\t%.2f%n", (int) row[0], row[1], row[2], row[3]);
        }

        // Display results
        System.out.println("\nWeights: " + Arrays.toString(weights));
        System.out.println("Profits: " + Arrays.toString(profits));
        System.out.println("Max Weight: " + maxWeight);
        System.out.println("Selected Items: " + items);
        System.out.println("Total Profit: " + totalProfit);
    }
}
