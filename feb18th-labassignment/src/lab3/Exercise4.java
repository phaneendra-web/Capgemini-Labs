package lab3;

import java.util.Scanner;

public class Exercise4 {
	static int modifyNumber(int num) {
		String s=Integer.toString(num);
		StringBuffer b=new StringBuffer();
		for(int i=1;i<s.length();i++) {
			char c=s.charAt(i-1);
			int c2=(int)c;
			char c1=s.charAt(i);
			int c3=(int)c1;
			int dif=Math.abs(c3-c2);
			b.append(dif);
			
			
			
		}
		b.append(s.charAt(s.length()-1));
		String o=b.toString();
		int out=Integer.parseInt(o);
		return out;
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println(modifyNumber(num));
		sc.close();

	}


}
