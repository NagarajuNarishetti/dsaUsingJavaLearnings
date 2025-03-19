import java.util.Arrays;

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int i = fruits.length - 1, count = fruits.length;
        Arrays.sort(fruits); // Sorting fruits (not baskets)

        while (i >= 0) {
            int j = 0;
            while (j < baskets.length) {
                System.out.println("Checking fruit " + fruits[i] + " with basket " + baskets[j]);
                if (baskets[j] >= fruits[i]) {
                    System.out.println("Placing fruit " + fruits[i] + " in basket " + baskets[j]);
                    count--;
                    baskets[j] = 0; // Mark basket as used
                    break;
                }
                j++;
            }
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] fruits = {4, 2, 5}; 
        int[] baskets = {3, 5, 4}; 
        System.out.println("Unplaced Fruits: " + sol.numOfUnplacedFruits(fruits, baskets));
    }
}
