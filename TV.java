class TV{

  static int minVol =0;
  static int maxVol = 100;
  static int currentVol = 40 ;
  static boolean isONorOFF;
  public static boolean onoroff(){
  
  System.out.println("Onoff start");
  System.out.println("-------------------------");
  if(isONorOFF == false){
	  isONorOFF = true;
	  System.out.println("the TV is turn on....enjoy");
  }
  else if(isONorOFF == true){
	  isONorOFF = false;
	  System.out.println("the TV is off");  
  }
   System.out.println("-------------------------");
   System.out.println("Onoff end");
  
return isONorOFF;
  
  }
  
  
  public static void increaseVol(){
	  if(isONorOFF == true){
		  if(currentVol < maxVol){
			currentVol = currentVol + 1;
	System.out.println("The current volume is " + currentVol);
		}  
		else{
			System.out.println("maximum volume is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Tv");
		}
	  
	  
	  
  }
  
   public static void decreaseVol(){
	  if(isONorOFF == true){
		  if(currentVol > minVol){
			currentVol = currentVol - 1;
	System.out.println("The current volume is " + currentVol);
		}  
		else{
			System.out.println("minimum Volume is reached");
			
		}
	  }
	  
	  else{
			System.out.println("First turn on the Tv");
		}
	  
	  
	  
  }
  
  }