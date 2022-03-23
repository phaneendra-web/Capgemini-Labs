package lab4;

 class Account {
	private long accNum;
	private double balance;
	private Account accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Account getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Account accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double i) {
		this.balance=this.balance+i;
		
	}
	public void withdraw(double i) {
		if(i<=this.balance-500) {
			this.balance=this.balance-i;
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}
	public double getBalance() {
		return this.balance;
	}

}
class Savings_Account extends Account{
	final double minimum_bal=200;
	@Override
	public void withdraw(double i) {
		Account bal=new Account();
		if(bal.getBalance()>200) {
			super.withdraw(i);
		}
		else {
			System.out.println("In sufficient funds");
		}
		
	}
	
	
}
class Current_Account extends Account{
	double overdraft_limit;
	@Override
	public void withdraw(double i) {
		
	}
}

public class Human{
	private String name;
	private float age;
	public static void main(String[] args) {
		Account arun=new Account();
		arun.deposit(1000);
		arun.setAccHolder(arun);
		arun.setAccNum(10111213);
		
		Account ram=new Account();
		ram.deposit(4000);
		ram.setAccHolder(ram);
		ram.setAccNum(1011214);
		
		arun.deposit(3000);
	
		ram.withdraw(2000);
		System.out.println(arun.getBalance());
		System.out.println(ram.getBalance());
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
