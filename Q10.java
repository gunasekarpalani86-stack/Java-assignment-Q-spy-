class mob 
{
	
	//QUESTION Juice bottle packing 
	

	/*  A store has 5000 rs
	It buys 12 juice bottles 
	price of each bottle is 120  rs 
	Then pack   all 12 bottles equally into   5  boxes
	
	Find the Totel purchase amount 
	remaining money
	Bottles in each box 
	remaining bottles
	
	
	
	Wajp To store and print the data */
	
	
	public static void main(String[] args) 
	{
		int  nbot= 12 ;
		double pri=120;
		double wal=5000;
		int box=5;
		
		
		
	
		System.out.println("Store account wallet balance is "+ wal +" Rs " );
		System.out.println("Total number of the juice bottle is :" +  nbot );
		
		System.out.println("Amount of the each bottle is " + pri + " Rs ");
		
		double tot=pri*nbot;
		
		System.out.println("Total amount of the 12 Bottles is " + tot +" Rs "  );
		
		double re=wal-tot;
		
		System.out.println("Remaining Amount in Store wallet is : " + re + " Rs ") ;
		
		int pack=nbot/box;
		
		System.out.println("Number of boxes is "+ box);
		System.out.println("Number of Bottle in a each is boxes : " + pack ) ;
		
		int reb=nbot%box;
		
		System.out.println("Number of Remaning bottles is "+ reb);
		
	}
}
