package Model;

import java.util.HashMap;
import java.util.Map;

public class AtmOpreationImplementation implements AtmOperationInterface {
	ATM atm=new ATM();
	Map<Double, String> ministmt=new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available balance is: "+ atm.getBalance()+ "Euro");
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0) {
			if(withdrawAmount <=atm.getBalance()) {
				ministmt.put(withdrawAmount, "AmountWithdraw");
				System.out.println("Collect the cash" + withdrawAmount );
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insuffiecient Balance");
			}
		}
		else {
			System.out.println("Pease enter te amount in Multiples of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		
		// TODO Auto-generated method stub
		ministmt.put(depositAmount, "Amount Deposited");
		System.out.println(depositAmount + "Deposited successfully");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double, String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+ ""+m.getValue());
			
		}
		
	}

}
