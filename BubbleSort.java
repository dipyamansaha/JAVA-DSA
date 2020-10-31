import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = scn.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements of array");
		for (int i = 0; i < len; i++)
			arr[i] = scn.nextInt();
		bubblesort(arr);
		System.out.println("Sorted array is");
		for (int j = 0; j < len; j++)
			System.out.print(arr[j]+ " ");

	}
	public static void bubblesort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			int flag =0;
			for (int j = i; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					flag =1;
				}
				
				
			}
			if(flag ==0)
				break;
			
			
			
		}
		
	}
		
		
		
	}
