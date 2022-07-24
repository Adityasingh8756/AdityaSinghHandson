package Sixth_DayHandson;
abstract class GeneralBank {

	abstract int getSavingsInterestRate();
	abstract int getFixedDepositInterestRate();
	
}
 class ICICIBank extends GeneralBank 
 {
	 int getSavingsInterestRate()

	 {
		return 4 ;
		
	 }
	 int getFixedDepositInterestRate()
	 {
		return 6;
		 
	 }
	 
 }
 class KotMBank extends GeneralBank 
 {
	 int getSavingsInterestRate()

	 {
		return 6;
		
	 }
	 int getFixedDepositInterestRate()
	 {
		return 9;
		 
	 }
	 
 }


public class Testbank {

	public static void main(String[] args) {
		
		ICICIBank i=new ICICIBank();

		 KotMBank k=new KotMBank();

		 GeneralBank gICICI=new KotMBank();

		 GeneralBank gKotMBank=new ICICIBank();
		 System.out.println("ICICI Bank Interest Rate : ");
		 System.out.println("ICICI Bank Saving Interest Rate : "+i.getSavingsInterestRate());
		 System.out.println("ICICI Bank Deposit Interest Rate : "+i.getFixedDepositInterestRate());
		 System.out.println("/n/nKotMBank Interest Rate");
		 System.out.println("KotMBank Bank Saving Interest Rate : "+k.getSavingsInterestRate());
		 System.out.println("ICICI Bank Deposit Interest Rate : "+k.getFixedDepositInterestRate());
	
		 System.out.println("General Bank 1 Interest Rate");
		 System.out.println(" Saving Interest Rate : "+gICICI.getSavingsInterestRate());
		 System.out.println(" deposit Interest Rate : "+gICICI.getFixedDepositInterestRate());
		 
		 System.out.println("General Bank 2 Interest Rate");
		 System.out.println(" Saving Interest Rate : "+gKotMBank.getSavingsInterestRate());
		 System.out.println(" deposit Interest Rate : "+gKotMBank.getFixedDepositInterestRate());


		
	}

}
