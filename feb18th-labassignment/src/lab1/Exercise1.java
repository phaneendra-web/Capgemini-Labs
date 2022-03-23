package lab1;
import java.util.*;

public class Exercise1 {
	
	public static int sumofcubes(int n) {
		int sum=0;
		while(n>0) {
			sum+=Math.pow(n%10, 3);
			n=n/10;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sumofcubes(n));
		sc.close();
		System.exit(n);
		//.................
		

	}

}
