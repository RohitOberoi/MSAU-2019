package package1;

public class testing {
	public int balance;
	public int withdrawn;
	 public void set(int bal,int wid)
	 {
		 this.balance=bal;
		 this.withdrawn=wid;
	 }
	 public int get()
	 {
		 if(balance>withdrawn)
		 {
			 balance=balance-withdrawn;
			 System.out.println("balance="+balance);
			 return balance;
		 }
		 else
		 {
			 System.out.println("insufficient balance");
			 return -1;
		 }
		 
	 }
	 
	
}
