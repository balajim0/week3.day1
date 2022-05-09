package week3.day1;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank = new AxisBank();
		bank.depositAcc();
		bank.savingAccount();
		bank.fixedAcc();
		BankInfo bank1 = new BankInfo();
		bank1.depositAcc();
	}

	public void depositAcc() {
		System.out.println("Deposited account");
		super.depositAcc();
	}

}
