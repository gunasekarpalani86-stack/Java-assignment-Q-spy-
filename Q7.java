class mob 
{
	
	//QUESTION Chocolate Distribution

	/* Rahul has 53 chocolates 
	He distributed them equally among 5 friends .
	
	Find the remaining chocolates .
	
	
	
	Wajp To store and print the data */
	
	
	public static void main(String[] args) 
	{
		int choco= 53;
		String name="Rahul";
		
		int frnd=5;
		
		
		System.out.println("Quantity of the chocolate is "  + choco);
		
		System.out.println("Rahul need to  divide the chocolates equally to his " +frnd + " Friend " );
		
		choco= choco%frnd ;
		System.out.println("After destribution the remaining chocolate  is : " + choco);
		
	
		
	}
}
