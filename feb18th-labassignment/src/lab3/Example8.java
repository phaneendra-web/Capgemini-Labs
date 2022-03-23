package lab3;
import java.util.*;
public class Example8 {
	static boolean checkString(String str) {
		char s[]=str.toCharArray();
		boolean flag=true;
		for(int i=0;i<s.length;i++) {
			for(int j=i;j<s.length;j++) {
				if(s[j]<s[i]) {
					flag=false;
					break;
					
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(checkString(n));
		sc.close();
		

	}

}
