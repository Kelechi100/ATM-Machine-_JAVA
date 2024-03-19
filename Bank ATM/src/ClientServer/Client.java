package ClientServer;

import java.util.Scanner;

import Model.AtmOperationInterface;
import Model.AtmOpreationImplementation;

public class Client {
	public static void main(String[] args) {
		AtmOperationInterface op=new AtmOpreationImplementation();
		int atmnumber = 12345;
		int atmPin = 123;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter ATM Number: ");
		int atmNumber = in.nextInt();
		System.out.println("Enter Pin:");
		int pin = in.nextInt();
		// validation
		if((atmnumber == atmNumber)&&(atmPin == pin)){
			System.out.println("Begin your transaction");
			// Listing out menu
			while(true) {
				System.out.println("1. View current Balance\n2.Withdraw Amount\n3.Make a Deposit\n4.View the Ministatement\n5.Exit");
				System.out.println("Enter Choice:");
				int ch=in.nextInt();
				if(ch == 1) {
					op.viewBalance();
					
				}
				else if(ch == 2){
					System.out.println("Enter amount to withdrawl");
					double withdrawAmount= in.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch == 3) {
					System.out.println("Enter Deposit Amount");
					double depositAmount=in.nextDouble();//5000
					op.depositAmount(depositAmount);
				}
				else if(ch==4){
					op.viewMiniStatement();
					
					
			
				}
				else if(ch==5) {
					System.out.println("Take your ATM card \n Thank you! ");
					System.exit(0);
					
				}
				else
				{
					System.out.println("Please Enter the correct choice number");
				}
			}
		}
		else {
			System.out.println("Error Incorrect ATM number or Pin");
			System.exit(0);
		}
		
		
	}

}
