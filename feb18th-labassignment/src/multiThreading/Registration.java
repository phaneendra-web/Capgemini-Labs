package multiThreading;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

	public static boolean isValid(String userName)
	{
		Pattern pattern=Pattern.compile(".{8,}_job");
		Matcher matcher=pattern.matcher(userName);
		return matcher.matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String userName=sc.nextLine();
		System.out.println(isValid(userName));
	}

}