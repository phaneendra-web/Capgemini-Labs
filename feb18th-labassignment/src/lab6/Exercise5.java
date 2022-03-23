package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {
	
	public static int getSecondSmallest(int[]arr) {
		ArrayList<Integer> lis=new ArrayList<>();
		for(int i: arr) {
			lis.add(i);
		}
		Collections.sort(lis);
		
		return lis.get(0);
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int n=sc.nextInt();
		System.out.println("Enter Integers");
		int[] arr=new int[n];
		int i=0;
		while(i<n) {
			arr[i]=sc.nextInt();
			i++;
		}
		//System.out.println(arr[2]);
		System.out.println(getSecondSmallest(arr));
		sc.close();
	}
		

}
