public class Test
{
    // Simple binary search algorithm
    static int binarySearch(int arr[], int s, int e, int x)
    {
        if (s<=e)
        {
            int mid = s + (e - s)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, s, mid-1, x);
            return binarySearch(arr, mid+1, e, x);
        }
        return -1;
    }
    
    // Method takes an infinite size array and a key to be
    // searched and returns its position if found else -1.
    // We don't know size of arr[] and we can assume size to be
    // infinite in this function.
    // NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE
    // THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING
    static int findPos(int arr[],int key) 
    {
        int start=0;
        // int val = arr[0];
        int end=1;
        // Find h to do binary search
        while (arr[end] < key)
        {
           int newStart =end+1; 
           end=end+2*(end-start+1);
           start= newStart; 
        }

        // at this point we have updated low
        // and high indices, thus use binary 
        // search between them
        return binarySearch(arr, start, end, key);
    }

    // Driver method to test the above function
    public static void main(String[] args) 
    {
        int arr[] = new int[]{3, 5, 7, 9, 10,10,10,10, 90, 
                            100, 130, 140, 160, 170};
        int ans = findPos(arr,100);
        
        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
}
