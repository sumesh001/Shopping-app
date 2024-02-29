package in.sky.framework;

public abstract class NormalAcc extends ShopAcc {
	private final float  deliveryCharges;
	
	public NormalAcc(int accountNumber, String accountName, float charges,  float deliveryCharges) {
		super(accountNumber, accountName, charges);
		this.deliveryCharges = deliveryCharges;
		}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	public abstract void bookProduct(float price);
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName() + ", getCharges()=" + getCharges() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
