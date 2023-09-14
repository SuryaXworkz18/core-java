class Hotel{
  
  String menuNames[] = new String[10];
  int index;
  
  public boolean addFoodName(String foodName){
  
  boolean isAdded = false;
  if(foodName!=null){
  
  menuNames[index]=foodName;
  index++;
  isAdded=true;
  
  
  }
  
  return isAdded;
  
  }
  public void getMenu(){
  
  for(int index=0;index<menuNames.length;index++){
  System.out.println(menuNames[index]);
  
  }
  }

}