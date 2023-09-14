class CricketTeam{
String playerNames[] = new String[11];
int i;
public boolean addPlayerName(String playerName){
	boolean isPlayerAdded = false;
	if(playerName!=null){
		
		playerNames[i] = playerName;
		i++;
		isPlayerAdded = true;
	}
	
	
	return isPlayerAdded;
}

public void getPlayerNames(){
	
	for(int i=0;i<playerNames.length;i++){
		
		System.out.println(playerNames[i]);
	}
	
}


}