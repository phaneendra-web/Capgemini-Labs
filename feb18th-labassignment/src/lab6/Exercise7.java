package lab6;
import java.util.*;

public class Exercise7 {
	
	public static int[] getSorted(int[] arr) {
		int[] s=new int[arr.length];
		int k=0;
	//	ArrayList<String> lis=new ArrayList();
		
		
		for(int i: arr) {
			int temp=0;
			while(i>0) {
				int n=i%10;
				temp=n+temp*10;
				i=i/10;}
			s[k]=temp;
			k+=1;}
		Arrays.sort(s);

		return s;
	}

	public static void main(String[] args) {
	
		int[] arr= {10895,228749,3289903,456233,546,6};
		int[] out=getSorted(arr);
		System.out.println(Arrays.toString(out));

	}

}


