package bowling;

import java.util.ArrayList;

public class BowlingGame {
	ArrayList<User> players = new ArrayList<User>();
	int userNum;
	User presentUser;
	
	BowlingGame(int userNum) {
		this.userNum = userNum;
		for(; userNum >0; userNum--) {
			players.add(new User());
		}
	}
}
