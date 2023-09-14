class Ottplatform{
	
	String movieNames[] = new String[5];
	int index;
//ADD/CREATE/SAVE
     public boolean addMovieName(String movieName){
	 
	 System.out.println("Inside add method");
	 
	 boolean isAdded = false;
	 System.out.println("Validation of adding a movie");
	 if(movieName != null){
	 movieNames[index] = movieName;
	 index++;
	 isAdded= true;
	 System.out.println("Movie add Successfully");
	 
	 
	 }
	 return isAdded;
	 }

//READ Operation
public void getMovie(){
	
	for(int index = 0; index< movieNames.length-1;index++){
		System.out.println(movieNames[index]);
		
	}
	
}
}