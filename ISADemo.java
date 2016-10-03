class Account
{
	int accountNo;
	double balance;
	void withDraw(){
		System.out.println("Account Class WithDraw...");
	}
	void roi(){
		System.out.println("Account Class UseLess ROI...");
	}
	void deposit(){
		System.out.println("Account Class Deposit");
	}
}
// Override - When There is IS-A and signature must be same
class SavingAccount extends Account
{
	@Override  // It is an Annotation 
	void withDraw(){
		System.out.println("WithDraw Limit is Set to 50K");
	}
	@Override
	void roi(){
		System.out.println("Get 4% ROI");
	}
	
}
class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("Pay 5% ROI");
	}
	void odLimit(){
		System.out.println("Get OD Limit in CA...");
	}
}
class AccountCaller
{
	void caller(Account account){
		
		account.withDraw();
		account.deposit();
		
		account.roi();
		if(account instanceof CurrentAccount){
		CurrentAccount ca = (CurrentAccount) account; //Downcasting
		ca.odLimit();	
		}
			
		}
}
public class ISADemo {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AccountCaller ac = new AccountCaller();
		ac.caller(new SavingAccount());
		ac.caller(new CurrentAccount());
//		Account sa = new SavingAccount(); //Upcasting
//		//SavingAccount sa = new SavingAccount();
//		sa.withDraw();
//		sa.deposit();
//		//sa.recROI();
//		sa.roi();
//		System.out.println("*******************************");
//		sa = new CurrentAccount();
//		//CurrentAccount ca = new CurrentAccount();
//		sa.withDraw();
//		sa.deposit();
//		sa.roi();
//		//ca.payROI();
//		sa.odLimit();

	}

}
