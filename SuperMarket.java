class SuperMarket{
		
	   
	 
       static String[] soaps = {"Dove", "Lux", "Lifebuoy", "Pears", "Santoor", "Mysore Sandal", "Hamam", "Rexona", "Fiama Di Wills", "Cinthol", "Medimix", "Safeguard", "Nivea", "Irish Spring", "Camay"};
       static String[] drinks = {"Coca-Cola", "Pepsi", "Sprite", "Fanta", "Mountain Dew", "Dr. Pepper", "7UP", "A&W Root Beer", "Mango Lassi", "Iced Tea", "Lemonade", "Ginger Ale", "Club Soda", "Energy Drink", "Orange Juice"};
       static String[] vegetables = {"Carrot", "Broccoli", "Spinach", "Tomato", "Bell Pepper", "Cabbage", "Cauliflower", "Cucumber", "Zucchini", "Eggplant", "Green Beans", "Kale", "Asparagus", "Lettuce", "Brussels Sprouts"};
       static String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Watermelon", "Strawberry", "Pineapple", "Mango", "Kiwi", "Pear", "Peach", "Plum", "Cherry", "Blueberry", "Raspberry"};
       static String[] snacks = {"Potato Chips", "Popcorn", "Pretzels", "Trail Mix", "Granola Bars", "Cheese Puffs", "Pita Chips", "Nuts", "Dried Fruit", "Crackers", "Rice Cakes", "Cereal Bars", "Tortilla Chips", "Cookies", "Chocolate"};
	   static String[] chocolates = {"Cadbury", "Hershey's", "Lindt", "Ferrero Rocher", "Godiva", "Toblerone", "Milka", "Kit Kat", "Snickers", "Mars", "Twix", "Ghirardelli", "Ritter Sport", "Kinder", "Reese's"};
       static String[] perfumes = {"Chanel", "Dior", "Gucci", "Armani", "Versace", "Tom Ford", "Yves Saint Laurent", "Burberry", "Calvin Klein", "Jo Malone", "Paco Rabanne", "Hermès", "Marc Jacobs", "Givenchy", "Victoria's Secret"};
       static String[] sandals = {"Birkenstock", "Adidas", "Nike", "Reef", "Crocs", "Teva", "Chaco", "Ecco", "Skechers", "Clarks", "Vionic", "Birkenstock", "Havaianas", "Rainbow", "FitFlop"};
       static String[] restaurants = {"McDonald's", "Subway", "Pizza Hut", "KFC", "Burger King", "Domino's Pizza", "Taco Bell", "Wendy's", "Papa John's", "Chipotle", "Panera Bread", "Olive Garden", "Applebee's", "Chili's", "Red Lobster"};
	
	public static void main(String args[]){
		
		
	
		getSuperMarketItems(soaps);
		getSuperMarketItems(drinks);
		getSuperMarketItems(vegetables);
		getSuperMarketItems(fruits);
		getSuperMarketItems(snacks);
		getSuperMarketItems(chocolates);
		getSuperMarketItems(perfumes);
		getSuperMarketItems(sandals);
		getSuperMarketItems(restaurants);
		
		}
		
		
	public static void getSuperMarketItems(String array[]){
		for(int index=0;index<array.length;index++){
			System.out.println(array[index]);
		}
		
		for(int anotherIndex=array.length-1;anotherIndex>=0;anotherIndex--){
			System.out.println(array[anotherIndex]);
		}
		
	}
		
		
		
}