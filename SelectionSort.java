
import java.util.Scanner;
class SelectionSort { 
   
    public static void selectionsort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
	
  
    public static void main(String args[]) 
    {  Scanner scn = new Scanner(System.in);
	   System.out.println("Enter length of array"); 
	   int n = scn.nextInt();
	   int[] arr = new int[n];
	   System.out.println("Enter elements"); 
	   for(int i =0; i < n; i ++)
	   arr[i]=scn.nextInt();
	   System.out.println("Entered array"); 
	   for(int val: arr)
	    System.out.println(val);
	   selectionsort(arr);
	   System.out.println("Sorted array"); 
	    for(int val: arr)
	    System.out.println(val);
		
	    
    } 
}