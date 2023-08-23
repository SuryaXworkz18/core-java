class Oven{

  static int minTemp =180;
  static int maxTemp = 287;
  static int currentTemp = 210 ;
  static boolean isONorOFF;
  public static boolean onoroff(){
  
  System.out.println("Onoff start");
  System.out.println("-------------------------");
  if(isONorOFF == false){
	  isONorOFF = true;
	  System.out.println("the Oven is turn on....enjoy");
  }
  else if(isONorOFF == true){
	  isONorOFF = false;
	  System.out.println("the Oven is off");  
  }
   System.out.println("-------------------------");
   System.out.println("Onoff end");
  
return isONorOFF;
  
  }
  
  
  public static void increaseTemp(){
	  if(isONorOFF == true){
		  if(currentTemp < maxTemp){
			currentTemp = currentTemp + 1;
	System.out.println("The current Tempume is " + currentTemp);
		}  
		else{
			System.out.println("maximum Temp is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Oven");
		}
	  
	  
	  
  }
  
   public static void decreaseTemp(){
	  if(isONorOFF == true){
		  if(currentTemp > minTemp){
			currentTemp = currentTemp - 1;
	System.out.println("The current Tempume is " + currentTemp);
		}  
		else{
			System.out.println("minimum Temp is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Oven");
		}
	  
	  
	  
  }
  
  }