package lab1;
import java.util.*;
public class Exercise6 {
	static int calculateDifference(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=Math.pow(i, 2);
		}
		return Math.abs((int)(sum-Math.pow((n*(n+1))/2, 2)));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
		sc.close();
		

	}

}
