
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter length of series you want to print");
		int num = scn.nextInt();
		int a =0;
		int b =1;
			System.out.println("The series is ");
		while(num>=0) {
			int sum = a+b ;
			System.out.println(a);
			a=b;
			b=sum;
			
			
			num--;
		}

	}

}