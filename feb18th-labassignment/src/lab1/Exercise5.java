package lab1;
import java.util.*;
public class Exercise5 {
	public static int calculateSum (int n) {
		int sum=0;
		int i=1;
		int s=1;
		while(i<=n) {
			if(s%3==0 || s%5==0) {
				sum+=s;
				i+=1;
			}
			s+=1;
			
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(calculateSum(n));
		sc.close();
		
		
	}

}
