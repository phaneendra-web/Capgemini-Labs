package lab9;
class operation{
	int factorial(int n) {
		int sum=1;
		while(n>0) {
			sum*=n;
			n--;
		}
		return sum;
	}
}
interface if2 {
	int fact(int m);
}
public class Example5 {
 public static void main(String[] args) {
		operation op=new operation();
		if2 p=op:: factorial;
		System.out.println(p.fact(3));
		
		
		
	}
	

}
