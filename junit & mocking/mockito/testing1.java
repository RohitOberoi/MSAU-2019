package package1;

public class testing1 {
	public int balance;
	public int withdrawn;
	public String user_name;
	public String user_password;

	testing2 t;
	public testing1(testing2 t) {
		this.t=t;
	}
	 public void set(int bal,int wid)
	 {
		 this.balance=bal;
		 this.withdrawn=wid;
		
	 }
	 
	 public int get()
	 {
		 if(t.checkid(user_name,user_password))
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
		 else
		 {
			 System.out.println("incorrect username or password");
			 return -2;
		 }
	 }
	 
	
}
