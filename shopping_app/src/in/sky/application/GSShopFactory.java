package in.sky.application;

import in.sky.framework.*;

public class GSShopFactory extends ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAcc(int accountNumber, String accountName, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return new GSPrimeAcc(accountNumber, accountName, charges, isPrime);
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accountNumber, String accountName, float charges, float deliveryCharges){
		// TODO Auto-generated method stub
		return new GSNormalAcc(accountNumber, accountName, charges, deliveryCharges);
	}


}
