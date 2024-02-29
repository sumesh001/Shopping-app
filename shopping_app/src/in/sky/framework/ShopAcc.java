package in.sky.framework;

public abstract class ShopAcc {
	private int accountNumber;
	private String accountName;
	private float charges;


	public ShopAcc(int accountNumber, String accountName, float charges) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.charges = charges;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public float getCharges() {
		return charges;
	}


	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	public abstract void bookProduct(float price);
	
	public abstract void items();


	@Override
	public String toString() {
		return "ShopAcc [accountNumber=" + accountNumber + ", accountName=" + accountName + ", charges=" + charges
				+ "]";
	}
	
	

}
