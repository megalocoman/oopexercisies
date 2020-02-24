package excersiceoop;

public class Account {
	
	private int id;
	private String name;
	private int balance;
	
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Account(int i, String name) {
		this.id = i;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		this.balance = balance+ amount;
		return balance;
	}
	public int debit(int amount) {
		if (amount<=this.balance) {
			this.balance-=amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;	
	}
	
	public int transferTo(Account another, int amount) {
		if(amount<=this.balance) {
			this.balance-=amount;
			another.credit(amount);
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public String toString() {
		return "Account[id= "+id+", name= "+name+", balance= "+balance+"]";
	}

}
