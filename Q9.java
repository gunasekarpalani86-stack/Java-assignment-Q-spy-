class mob 
{
	
	//QUESTION Rice bag packing 
	

	/* A shop has 95  Rice bag .
	Each truck can carry 9 rice bags .
	Find 
	Number of full load 
	remaining rice bag 
	
	
	
	Wajp To store and print the data */
	
	
	public static void main(String[] args) 
	{
		int  tot= 95 ;
		int truck=9;
		
		
		int bal=tot%truck;
		int lod= tot-bal;
		System.out.println("Shop has " +tot+" Rice bag" );
		System.out.println("Number of rice bags to send  : " + lod);
		System.out.println("Remaining rice bags in shop warehouse : " + bal);
		

		
	
		
	}
}
