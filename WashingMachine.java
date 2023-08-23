class WashingMachine{

  static int minRotationalSpeed =200;
  static int maxRotationalSpeed = 1200;
  static int currentRotationalSpeed = 600 ;
  static boolean isONorOFF;
  public static boolean onoroff(){
  
  System.out.println("Onoff start");
  System.out.println("-------------------------");
  if(isONorOFF == false){
	  isONorOFF = true;
	  System.out.println("the WashingMachine is turn on....enjoy");
  }
  else if(isONorOFF == true){
	  isONorOFF = false;
	  System.out.println("the WashingMachine is off");  
  }
   System.out.println("-------------------------");
   System.out.println("Onoff end");
  
return isONorOFF;
  
  }
  
  
  public static void increaseRotationalSpeed(){
	  if(isONorOFF == true){
		  if(currentRotationalSpeed < maxRotationalSpeed){
			currentRotationalSpeed = currentRotationalSpeed + 200;
	System.out.println("The current RotationalSpeedume is " + currentRotationalSpeed);
		}  
		else{
			System.out.println("maximum RotationalSpeedume is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the WashingMachine");
		}
	  
	  
	  
  }
  
   public static void decreaseRotationalSpeed(){
	  if(isONorOFF == true){
		  if(currentRotationalSpeed > minRotationalSpeed){
			currentRotationalSpeed = currentRotationalSpeed - 200;
	System.out.println("The current RotationalSpeedume is " + currentRotationalSpeed);
		}  
		else{
			System.out.println("minimum RotationalSpeed is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the WashingMachine");
		}
	  
	  
	  
  }
  
  }