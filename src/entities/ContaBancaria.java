package entities;



public class ContaBancaria {
	
	private int account;
	private	String name;
	private  double deposit;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int account, String name, double deposit) {
	
		this.account = account;
		this.name = name;
		this.deposit = deposit;
	}
	
	public ContaBancaria(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void depositValue(double deposit) {
		this.deposit = this.deposit + deposit;
	}
	
	public void withdrawValue(double deposit) {
		
		this.deposit = this.deposit - (deposit + 5.0);
	}
	
	public String toString() {
		return
				"Account " 
				+ account
				+ ", Holder: "
				+ name 
				+ ", Balance: $ "
				+ String.format("%.2f", deposit);
	}
}
	
