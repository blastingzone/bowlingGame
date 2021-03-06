package bowling;

import java.util.ArrayList;

public class User {
	ArrayList<Frame> frames = new ArrayList<Frame>(10);
	ScoreBoard scoreBoard = new ScoreBoard();
	Frame presentFrame;
	int index = 0;
	
	User() {
		frames.add(new Frame());
		presentFrame = frames.get(0);
	}
	
	void showScore() {
		scoreBoard.getFrames(frames);
		scoreBoard.showBoard();
	}
	
	int getFrame() {
		return frames.indexOf(presentFrame);
	}
	
	void roll() {
		presentFrame.roll();
		if(presentFrame.isClosed() && index < BowlingGame.MAX_FRAME) {
			index++;
			
			if(index != BowlingGame.MAX_FRAME -1)
				frames.add(new Frame());
			else
				frames.add(new LastFrame());
			
			presentFrame = frames.get(index);
		}
		showScore();
	}
}