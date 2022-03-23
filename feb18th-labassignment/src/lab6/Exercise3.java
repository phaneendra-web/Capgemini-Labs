package lab6;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	
	public static Map<Integer,Integer> getSquares(int[] ar){
//		Iterator i=arr.iterator();
		Map<Integer,Integer> map=new HashMap<>();
//		
//		while(i.hasNext()) {
//			Integer t=(Integer) i.next();
//			map.put(t,t*t);
//		}
		for(int i: ar) {
			map.put(i,i*i);
			
			
		}
		return map;
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int i=0;
		while(i<n) {
			arr[i]=sc.nextInt();
			i+=1;
		}
		System.out.println(getSquares(arr));
		sc.close();
		
	}
	

}
