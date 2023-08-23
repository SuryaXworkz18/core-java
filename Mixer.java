class Mixer{

  static int minSpeed =0;
  static int maxSpeed = 5;
  static int currentSpeed = 0 ;
  static boolean isONorOFF;
  public static boolean onoroff(){
  
  System.out.println("Onoff start");
  System.out.println("-------------------------");
  if(isONorOFF == false){
	  isONorOFF = true;
	  System.out.println("the Mixer is turn on....enjoy");
  }
  else if(isONorOFF == true){
	  isONorOFF = false;
	  System.out.println("the Mixer is off");  
  }
   System.out.println("-------------------------");
   System.out.println("Onoff end");
  
return isONorOFF;
  
  }
  
  
  public static void increaseSpeed(){
	  if(isONorOFF == true){
		  if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed + 1;
	System.out.println("The current Speedume is " + currentSpeed);
		}  
		else{
			System.out.println("maximum Speedume is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Mixer");
		}
	  
	  
	  
  }
  
   public static void decreaseSpeed(){
	  if(isONorOFF == true){
		  if(currentSpeed > minSpeed){
			currentSpeed = currentSpeed - 1;
	System.out.println("The current Speedume is " + currentSpeed);
		}  
		else{
			System.out.println("minimum Speed is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Mixer");
		}
	  
	  
	  
  }
  
  }