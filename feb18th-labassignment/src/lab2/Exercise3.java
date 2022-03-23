package lab2;
import java.util.*;
public class Exercise3 {
	static int[] getSorted(int arr[]) {
		int temp[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			String n=Integer.toString(arr[i]);
			
			String s="";
			char ch=0;
			
			for(int j=n.length()-1;j>=0;j--) {
				//System.out.println(j);
				ch=n.charAt(j);
				s=s+ch;
				//System.out.println(j+" "+s);
			}
			
			temp[i]=Integer.parseInt(s);
			
			
			
			
		}
		Arrays.sort(temp);
		return temp;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int out[]=getSorted(arr);
		System.out.println(Arrays.toString(out));
		sc.close();
		
		

	}

}
