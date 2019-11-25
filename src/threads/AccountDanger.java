package threads;

public class AccountDanger implements Runnable {

	public static void main(String[] args) {
		AccountDanger r = new AccountDanger();
		AccountDanger r2 = new AccountDanger();

		Thread one = new Thread(r);
		Thread two = new Thread(r2);
		one.setName("Fred");
		two.setName("Lucy");
		
		one.start();
		two.start();
	}


	public void run() {
		for(int x=0 ; x<5; x++) {
			makeWithDrawal(10);
			if(acct.getBalance()<0) {
				System.out.println("account is overdraw!");
			}
		}
	}

	private Account acct = new Account();

	private synchronized void makeWithDrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()
					+ " is going to withdraw " + amt);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}

			acct.withdrawal(amt);

		} else {
			System.out.println("Not enough in account for "
					+ Thread.currentThread().getName() 
					+ " to withdraw " + acct.getBalance());
		}
	}

}
