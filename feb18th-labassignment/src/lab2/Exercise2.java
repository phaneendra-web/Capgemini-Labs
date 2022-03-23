package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	static String getSecondSmallest(String arr[]) {

		Arrays.sort(arr);
		String s="";
		for(int i=0;i<arr.length;i++) {
			if(arr.length%2==0) {
			if(i<arr.length/2) {
				s=s+arr[i].toUpperCase()+" ";
			}
			else {
				s=s+arr[i].toLowerCase()+" ";
			}
		}
			else{
				if(i<arr.length/2+1) {
					s=s+arr[i].toUpperCase()+" ";
				}
				else {
					s=s+arr[i].toLowerCase()+" ";
				}
				}
			}
		
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" th Element");
			arr[i]=sc.next();
			
		}
		sc.close();
		System.out.println(getSecondSmallest(arr));

	}

}
