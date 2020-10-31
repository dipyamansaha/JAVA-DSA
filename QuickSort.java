import java.util.Scanner;
class QuickSort { 
   
    //This function puts all elements smaller than pivot to its left and elements larger than pivot to its right 
     //puts pivot at its correct position 
	 //here pivot is the last element of the array
    public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    public static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            //pi is pivot
			//thus pivot is now at the right position
            int pi = partition(arr, low, high); 
  
            
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
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
	   sort(arr, 0 , n-1);
	   System.out.println("Sorted array"); 
	    for(int val: arr)
	    System.out.println(val);
		
	    
    } 
    
}