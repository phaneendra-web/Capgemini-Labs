package lab1;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for Red");
		System.out.println("Enter 2 for Green");
		System.out.println("Enter 3 for violet");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Go");
			break;
		case 3:
			System.out.println("Ready");
			break;
		}
		sc.close();
		
		
		

	}

}
