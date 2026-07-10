class mob 
{
	
	//QUESTION Chocolates purches 
	
	/* Neha has 800 Rs in her wallet
	She buys 6 chocolates price for the each chocolates is 45 rs 
	
	Wajp To store and print the data */
	
	
	public static void main(String[] args) 
	{
		String name="Neha";
		double wal = 800;
		
		System.out.println("Name of the customer is :" + name);
		System.out.println("Account balance is :" + wal+ "Rs " );
		
		double price= 45;
		int qt= 6 ;
		double bill= price * qt ;
		
		System.out.println("Price for the single Chocolates is "+ 45 + "Rs ");
		System.out.println("Quantity : " + qt);
		System.out.println("Bill amount for the six Chocolates  is "+ bill + "Rs");
		
		wal= wal-bill ;
			
		System.out.println("After the Purchase your current account balance is : " + wal + "Rs");
		
		
	}
}
