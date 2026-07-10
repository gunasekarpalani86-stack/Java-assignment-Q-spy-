class mob 
{
	
	//QUESTION RECHARGE 
	/* Initialy suresh has 1200 Rs in his wallet
	He recharge his mobile with 399 Rs 
	
	Wajp To store and print the data */
	
	
	public static void main(String[] args) 
	{
		String name="Suresh";
		double wal = 1200;
		
		System.out.println("Name of the account holder is :" + name);
		System.out.println("Account balance is :" + wal+ "Rs " );
		
		double bill= 399 ;
		
		
		System.out.println("Bill amount for the mobile recharge is "+ bill + "Rs");
		
		wal= wal-bill ;
			
		System.out.println("After the recharge your current account balance is : " + wal + "Rs");
		
		
	}
}
