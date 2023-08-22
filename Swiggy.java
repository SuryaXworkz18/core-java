class Swiggy{

public static double search(String foodName , int quantity){

  double price = 0.0;
  System.out.println("invoke search: foodName(String),quantity(int)");
   if(foodName == "Burger"){
   price = 80.0 * quantity;
  
   }
   
    if(foodName == "pizza"){
   price = 280.0 * quantity;
	}
	
	
	if(foodName == "fries"){
   price = 80.0 * quantity;
	}
	
	System.out.println("search ended");
return price;

}


}