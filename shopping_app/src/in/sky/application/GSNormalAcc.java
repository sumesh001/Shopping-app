package in.sky.application;

import java.util.Scanner;

import in.sky.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accountNumber, String accountName, float charges, float deliveryCharges) {
		super(accountNumber, accountName, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	String[] items = {"Laptop", "Smartphone", "Headphones", "Tablet"};
	boolean[] itemAvailability = {true, true, false, true};
	float[] price = {45000, 10000, 2000, 6000};
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void bookProduct(float amount)
	{
		System.out.println("Which product you want to buy : ");
		int temp = sc.nextInt();
		
		for (int i = 0; i < itemAvailability.length; i++) {
			if(temp == i+1)
			{
				if(itemAvailability[i])
				{
					amount = price[i] + getCharges() + getDeliveryCharges();
					
					System.out.println("Item Successfully Booked costing "+ amount);
				}
				else
				{
					System.out.println("Item not available");
					break;
				}
			}
		}
	}
	
	public float getDeliveryCharges() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void items()
	{
		System.out.println("Items:");
        for (int i = 0; i < items.length; i++) {
            String status = (itemAvailability[i] ? "Available" : "Not Available");
            System.out.println((i + 1) + ". " + items[i] + " - " + status + " - " + price[i]);
        }
	}

}
