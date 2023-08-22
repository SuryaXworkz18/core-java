class GrubhubExecuter{
	public static void main(String args []){
		
	double price = Grubhub.search("Mutton Biriyani");
	System.out.println("The Price of Fish Thali is "+  price);
	
	price = Grubhub.search("Palava");
	System.out.println( "The Price of yasham Palava is " + price);
	
	}
	
	
	}