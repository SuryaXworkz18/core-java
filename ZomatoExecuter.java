class ZomatoExecuter{
	public static void main(String args []){
		
	double price = Zomato.search("Chicken Biriyani");
	System.out.println(  "The Price of Kushka"+  price);
	
	price = Zomato.search("pizza");
	System.out.println( "The Price of pizza" + price);
	
	
	
	
	}
}