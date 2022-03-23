package lab5;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		try {
			if(n<15) {
				throw new InvalidAge("Invalid Age");}
			}
		
		catch(InvalidAge e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Ended");
		}
		}

}

