package lab3;

import java.util.*;
public class Exercise2 {
	static String getImage(String str) {
		StringBuffer s= new StringBuffer(str);
		StringBuffer ans= s.reverse();
		String st=ans.toString();
		String fin=str+"|"+st;
		return fin;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(getImage(str));
		sc.close();

	}

}
