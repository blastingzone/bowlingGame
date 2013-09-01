package scoreCal;

import java.util.ArrayList;

import bowling.Frame;

public class Open implements Score{
	int score;

	@Override
	public int calScore(ArrayList<Frame> frames, Frame frame) {
		for (int score : frame.getEachScores()) {
			this.score += score;
		}
		return score;
	}
	
}
