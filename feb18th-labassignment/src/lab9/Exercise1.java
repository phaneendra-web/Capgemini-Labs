package lab9;
@FunctionalInterface
interface multi{
	public int power(int a, int b);
}
public class Exercise1 {
	public static void main(String[] args) {
		multi s= (a,b)-> (int)Math.pow(a,b);
		
		System.out.println(s.power(2, 3));
	}

}
