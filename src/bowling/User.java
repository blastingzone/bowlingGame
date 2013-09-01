package bowling;

import java.util.ArrayList;

public class User {
	ArrayList<Frame> frames = new ArrayList<Frame>();
	ScoreBoard scoreBoard = new ScoreBoard();
	Frame presentFrame;
	
	void showScore() {
		scoreBoard.getFrames(frames);
		scoreBoard.showBoard();
	}
}