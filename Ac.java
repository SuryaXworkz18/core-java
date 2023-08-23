class Ac{

  static int minTemp =15 ;
  static int maxTemp = 35;
  static int currentTemp = 20 ;
  static boolean isONorOFF;
  public static boolean onoroff(){
  
  System.out.println("Onoff start");
  System.out.println("-------------------------");
  if(isONorOFF == false){
	  isONorOFF = true;
	  System.out.println("the ac is turn on....enjoy");
  }
  else if(isONorOFF == true){
	  isONorOFF = false;
	  System.out.println("the ac is off");  
  }
   System.out.println("-------------------------");
   System.out.println("Onoff end");
  
return isONorOFF;
  
  }
  
  
  public static void increaseTemprature(){
	  if(isONorOFF == true){
		  if(currentTemp < maxTemp){
			currentTemp = currentTemp + 1;
	System.out.println("The current volume is " + currentTemp);
		}  
		else{
			System.out.println("maximum temprature is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Ac");
		}
	  
	  
	  
  }
  
   public static void decreaseTemprature(){
	  if(isONorOFF == true){
		  if(currentTemp > minTemp){
			currentTemp = currentTemp - 1;
	System.out.println("The current volume is " + currentTemp);
		}  
		else{
			System.out.println("minimum temprature is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Ac");
		}
	  
	  
	  
  }
  
  }