package lab1;
import java.util.*;
public class Exercise32 {
	public static int fic(int a,int b,int n) {
		int temp=a+b;
		if(n<=1) {
			return n;
		}
		return fic(b,temp,n-1)+fic(b,temp,n-2);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fic(1,1,n));
		sc.close();
		
	}

}
