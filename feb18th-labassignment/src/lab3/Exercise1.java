package lab3;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		StringTokenizer s=new StringTokenizer(n,",");
		int sum=0;
		int s1=0;
		while(s.hasMoreTokens()) {
			String t=s.nextToken();
			s1=Integer.parseInt(t);
			System.out.println(s1);
			sum+=s1;
		}
		System.out.println("sum is-"+sum);
		sc.close();

	}

}
