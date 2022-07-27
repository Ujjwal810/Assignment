package Day6;
/*Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and
getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate
that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class.
The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and
KotMBank - Savings 6% Fixed 9%.
Create a main method to test the above classes and their methods. Try one by one and observe your findings
a) ICICIBank i=new ICICIBank();
b) KotMBank k=new KotMBank();
c) GeneralBank g=new KotMBank();
d) GeneralBank g=new ICICIBank();*/

abstract class GeneralBank
{
	abstract double getsavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank
{   
	@Override
	double  getsavingsInterestRate()
	{
		return 4;
	}
	@Override
	double  getFixedDepositInterestRate()
	{
		return 8.5;
	}
}
class KotMBank extends GeneralBank
{
	@Override
	double  getsavingsInterestRate()
	{
		return 6;
	}
	@Override
	double  getFixedDepositInterestRate()
	{
		return 9;
	}
}
 class HandsOn42 {

	public static void main(String[] args) {
		ICICIBank obj=new ICICIBank();
		KotMBank k=new KotMBank();
		System.out.println("In ICICI interest on saving is: "+obj.getsavingsInterestRate());
		System.out.println("In ICICI interest on fixed is: "+obj.getFixedDepositInterestRate());
		System.out.println("In Kotak interest on saving is: "+k.getsavingsInterestRate());
		System.out.println("In Kotak interest on saving is: "+k.getFixedDepositInterestRate());
		
		GeneralBank g1=new KotMBank();
		GeneralBank g2=new ICICIBank();
		System.out.println("In ICICI interest on saving is: "+g1.getsavingsInterestRate());
		System.out.println("In ICICI interest on fixed is: "+g1.getFixedDepositInterestRate());
		System.out.println("In Kotak interest on saving is: "+g2.getsavingsInterestRate());
		System.out.println("In Kotak interest on fixed is: "+g2.getFixedDepositInterestRate());
	}

}
