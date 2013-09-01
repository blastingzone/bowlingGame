package scoreCal;

import java.util.ArrayList;

import bowling.Frame;

public class Spare implements Score {
	int score;

	@Override
	public int calScore(ArrayList<Frame> frames, Frame frame) {
		int index = frames.indexOf(frame);
		
		if(frame.getEachScores().size() != 2)
			return -1;
		
		for (int score : frame.getEachScores()) {
			this.score += score;
		}
		if(index < frames.size() - 1) {
			this.score += frames.get(index + 1).getEachScores().get(0);
			return score;
		}
		else
			return -1;
	}
}
