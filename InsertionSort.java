import java.util.Scanner;
class InsertionSort { 
   
    public static void InsertionSort(int arr[])
    { 
         int i, key, j;  
         int n = arr.length;
    for (i = 1; i < n; i++) 
    {  
        key = arr[i];  
        j = i - 1;  
  
        // Move elements of arr[0..i-1], that are  larger than key
        while (j >= 0 && arr[j] > key) 
        {  
            arr[j + 1] = arr[j];  
            j = j - 1;  
        }  
        arr[j + 1] = key;  
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
	   InsertionSort(arr);
	   System.out.println("Sorted array"); 
	    for(int val: arr)
	    System.out.println(val);
		
	    
    } 
}