package video10;

public class AccountMain {
	
	void main(int x) {
		System.out.println(x);
	}
	
	void main(int x, int y) {
		System.out.println(x+y);
	}
	
	void main(String name) {
		System.out.println(name);
	}

	public static void main(String a[]) {
		
		Account acc=new Account();
		
		acc.setAcctno(12345);
		acc.setName("Sathish");
		acc.setAmount(12212);
		
		System.out.println(acc.getAcctno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		
		AccountMain a1=new AccountMain();
		
		a1.main(1);
		a1.main(1,2);
		a1.main("Sathish");
		
		
	}
	

        
}
