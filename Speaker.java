class Speaker{

  static String speakerBrandName = "JBL";
  static int minVolume = 0;
  static int maxVolume = 8;
  static int currentVolume = 4;
  static boolean isConnected;
  public static boolean onoroff(){
  
  System.out.println("Onoff start");
  System.out.println("-------------------------");
  if(isConnected == false){
	  isConnected = true;
	  System.out.println("the speaker is turn on....enjoy");
  }
  else if(isConnected == true){
	  isConnected = false;
	  System.out.println("the speaker is off");  
  }
   System.out.println("-------------------------");
   System.out.println("Onoff end");
  
return isConnected;
  
  }
  
  public static void increaseVolume(){
	System.out.println("Start of decrese the volume");
	
	
	if(isConnected == true){
		if(currentVolume < maxVolume){
			
			currentVolume = currentVolume + 1;
	System.out.println("The current volume is" + currentVolume);
	
		}
		else{
			System.out.println("maximum volume is reached");
			
		}
		
	}
		else{
			System.out.println("First turn on the speaker");
		}
	
	
}
public static void decreaseVolume(){
	System.out.println("Start of decrese the volume");
	
	
	if(isConnected == true){
		if(currentVolume > minVolume){
			
			currentVolume = currentVolume - 1;
	System.out.println("The current volume is" + currentVolume);
	
		}
		else{
			System.out.println("minimum volume is reached");
			
		}
		
	}
		else{
			System.out.println("First turn on the speaker");
		}
	
	
}





}