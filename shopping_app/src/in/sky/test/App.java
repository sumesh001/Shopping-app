package in.sky.test;
import in.sky.application.*;
import in.sky.framework.*;

public class App {

	public static void main(String[] args) {
		ShopFactory factory = new GSShopFactory();
		ShopAcc prime = factory.getNewPrimeAcc(100, "sumesh", 10.0f, true);
		ShopAcc normal = factory.getNewNormalAcc(101, "sumit", 40.0f, 20.0f);
		prime.bookProduct(1);
		prime.items();
		
		normal.bookProduct(2);
		prime.items();
	}

}
