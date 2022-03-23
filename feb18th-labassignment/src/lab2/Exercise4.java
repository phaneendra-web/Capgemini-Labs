package lab2;
import java.util.*;
public class Exercise4 {
	static String modifyArray(int n[]) {
		Arrays.sort(n);
		int temp=0;
		for(int i=0;i<n.length-1;i++) {
			if(n[i]!=n[i+1]) {
				n[temp]=n[i];
				temp+=1;
				
			}
		}
		n[temp]=n[n.length-1];
		
		int a[]=new int[temp+1];
		int te=0;
		for(int i=temp;i>=0;i--) {
			a[i]=n[te];
			te+=1;
		}
		
		return Arrays.toString(a);	}
		

	

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(modifyArray(arr));
		sc.close();

	}

}
