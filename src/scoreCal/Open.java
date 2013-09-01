package scoreCal;

import java.util.ArrayList;

import bowling.Frame;

public class Open implements Score{
	int score;

	@Override
	public int calScore(ArrayList<Frame> frames, Frame frame) {
		if (frame.getEachScores().size() < 2)
			return -1;
		
		for (int score : frame.getEachScores()) {
			this.score += score;
		}
		return score;
	}
	
}
