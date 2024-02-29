package in.sky.framework;

public abstract class ShopFactory {
	
	public abstract PrimeAcc getNewPrimeAcc(int accountNumber, String accountName, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int accountNumber, String accountName, float charges, float deliveryCharges);

}
