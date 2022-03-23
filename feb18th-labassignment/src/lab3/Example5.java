package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Example5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int l=0,w=0;
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\\' && ch[i+1]=='n')
				l++;
			if(ch[i]==' ')
				w++;
		}
		
		System.out.println("No of characters: "+ch.length);
		System.out.println("No of words: "+(w+1));
		System.out.println("No of lines: "+(l+1));
		sc.close();
	}

}
