class ChatShop{

String chatNames[]= new String[10];
int index;
public boolean addChatName(String chatName){
 System.out.println("inside addChatName()");
 
 boolean isAdded = false;
 if(chatName != null){
	
	System.out.println("validation is proper..proceed to add chat");
	chatNames[index] = chatName;
	index++;
	isAdded = true;
	System.out.println(chatName +  " is added sucessfully  ");
	
	
}
return isAdded;
}
public void getChatNames(){
	for(int index=0;index<chatNames.length;index++){
		
		System.out.println(chatNames[index]);
	}
}


}