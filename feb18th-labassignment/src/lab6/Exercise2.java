package lab6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
	
	public static Map<Character,Integer> Count(char[] arr){
		
		Map<Character,Integer> m=new HashMap<>();
		
		Arrays.sort(arr);
		int i=0;
		while(i<arr.length) {
			int j=i+1;
			int count=0;
			//System.out.println(i);
			while( j<arr.length && arr[j]==arr[i] ) {
				count++;
				j=j+1;
				//System.out.println(j);
			
				
			}
			m.put(arr[i],count+1);
			i=j;
			
			
			
		}
		return m;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		char[] c=new char[n];
		int i=0;
		while(i<n) {
			System.out.println("Enter element");
			c[i]=sc.next().charAt(0);
			i=i+1;
		}
		Map<Character,Integer> out=Count(c);
		
		//System.out.println("Hi");
		System.out.println(out);
//		for(Map.Entry<Character, Integer> j: out.entrySet()) {
//			System.out.println(j);
//			
//		}
		sc.close();
		
	}

}
