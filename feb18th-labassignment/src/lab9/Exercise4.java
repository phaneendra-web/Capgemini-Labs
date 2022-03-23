package lab9;


class simple{
	String name;
	int age;
	simple(String name, int age){
		this.name=name;
		this.age=age;
	}
	 String m1( String name, int age) {
		return name+age;
	}}
	
@FunctionalInterface
interface Inf1{
	 String merge(String s,int s1);
}

public class Exercise4 {
	
	public static void main(String[] args) {
		simple ob=new simple("Phani", 21);
		
		
		  Inf1 m=ob::m1;
		  System.out.println(m.merge("Phani", 23));
		
		
	}

}

