package lab2;
import java.util.*;
public class Exercise1 {
	static int getSecondSmallest(int arr[]) {

		Arrays.sort(arr);
		
		return arr[1];
	}
	// Lab

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" th Element");
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		System.out.println(getSecondSmallest(arr));

	}

}
