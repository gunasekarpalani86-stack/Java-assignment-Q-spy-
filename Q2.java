class Books 
{
	public static void main(String[] args){
		
	/*Book purchase question no 2 
	
	Arun has 5000 rs in his wallet  , he buy's 4 Books 
	price of the each books 350 rs 
	Wajp to store and print the data 
	*/
	
	String name= "Arun";
	double wal= 5000;
	int qnt=4;
	int pri=350;
	
	System.out.println("Ename of the customer :" + name);
	
	double bill=qnt*pri;
	
	System.out.println("Total value of the bill amount:" + bill + "Rs");
	System.out.println("Current account balance :" + wal + "Rs ");
	
	wal=wal-bill;
	
	System.out.println("After purchased your account balance is :" + wal + "Rs ");
		
	}
}
