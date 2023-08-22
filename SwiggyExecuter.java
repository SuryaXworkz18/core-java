class SwiggyExecuter{
	
	public static void main(String args[]){
		

		
		System.out.println("Main Started");
		double price = Swiggy.search("Burger",5);
		
		System.out.println("The Price For burger is   " + price);
		
	
		  price = Swiggy.search("pizza",3);
		 System.out.println("The price of pizza  " + price);
		 
		 
		 System.out.println("main ended");
		}
}