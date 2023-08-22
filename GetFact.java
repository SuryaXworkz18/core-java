class GetFact{
public static void main(String args[]){
   getFact(6);
   getFact(7);
   getFact(4);.
   

}

public static void getFact(int factNumber){


  int fact =1;
  for(int n =1; n<factNumber; n++){
   fact = fact * n;
   }
  System.out.println("The factorial of " + factNumber + " is " + fact);
}

}
/* 

public static void getFact(int factNumber){
	
	int fact=1
	for(int n=1;n<factNumber
	
	
}
