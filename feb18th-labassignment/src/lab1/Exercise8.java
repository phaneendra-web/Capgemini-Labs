package lab1;
import java.util.*;
public class Exercise8 {
	public static boolean checkNumber(int n) {
		boolean t=true;
		while(n>=2) {
			if(n%2!=0) {
				t=false;
				break;
				
			}
			n=n/2;
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
