package lab1;
import java.util.*;
public class exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a=1;
		int b=1;
		
		int temp=-1;
		if(n==1 || n==2) {
			System.out.println(1);
			System.exit(0);
		}
		for(int i=2;i<n;i++) {
			temp=a+b;
			a=b;
			b=temp;
			
		}
		System.out.println(temp);
		
		
		
	}

}
