package lab3;
import java.util.*;
import java.time.*;

public class Exercise9 {
	static void getDiff(LocalDate s) {
		LocalDate n=LocalDate.now();
		Period p=Period.between(s, n);
		System.out.println("years difference "+p.getYears()+"\nMonth difference "+p.getMonths()+"\nDays difference "+p.getDays());
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter date in this format(yyyy-mm-date)");
		String s=sc.next();
		String[] str=s.split("-");
		LocalDate p=LocalDate.of(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
		getDiff(p);
		sc.close();
		
	}

}
