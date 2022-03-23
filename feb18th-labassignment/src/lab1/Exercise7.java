package lab1;
import java.util.*;
public class Exercise7 {
	public static boolean checkNumber(int n) {
		int current=n%10;
		n=n/10;
		boolean t=true;
		
		while(n>0) {
			if(current<=n%10) {
				t=false;
				break;
				
			}
			current=n%10;
			n=n/10;
		}
		return t;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
		
	}

}
