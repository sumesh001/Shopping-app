package in.sky.framework;

public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	private final static float charges = 10.0f;
	public PrimeAcc(int accountNumber, String accountName, float charges, boolean isPrime) {
		super(accountNumber, accountName, charges);
		 this.isPrime=isPrime;
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public static float getDeliverycharges() {
		return charges;
	}
	
	public abstract void bookProduct(float price);
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", isPrime()=" + isPrime() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountName()=" + getAccountName() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	 
	
}
