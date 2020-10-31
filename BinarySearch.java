import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = scn.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements of array");
		for (int i = 0; i < len; i++)
			arr[i] = scn.nextInt();
		System.out.println("Enter element to be searched");
		int key = scn.nextInt();
		int res = binarysearch(arr, key);
		if (res != -1)
			System.out.println("Element found at " + res);
		else
			System.out.println("Element not found");

	}

	public static int binarysearch(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			 int mid = (end - start) / 2 + start;
			//int mid = (start + end) / 2;
		
			if (arr[mid] == key) {
				
				return mid;
			} else if (arr[mid] > key) {
			
				end = (mid - 1) ;
			} else {
				
				start = (mid + 1) ;
			}
		}
		return -1;

	}

}
