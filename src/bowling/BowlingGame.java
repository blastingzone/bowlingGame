package bowling;

import java.util.ArrayList;

public class BowlingGame {
	final static int MAX_FRAME = 10;
	ArrayList<User> players = new ArrayList<User>();
	int userNum;
	User presentUser;

	BowlingGame(int userNum) throws GameOverException {
		this.userNum = userNum;
		for (; userNum > 0; userNum--) {
			players.add(new User());
		}
	}

	void gameStart() throws GameOverException {
		presentUser = players.get(0);
		while (presentUser.getFrame() < MAX_FRAME) {
			System.out.println("Present : " + presentUser.getFrame());
			presentUser.roll();
			if (presentUser.getFrame() == MAX_FRAME) {
				throw new GameOverException();
			}
		}
	}
}
