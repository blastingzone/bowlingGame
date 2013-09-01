package scoreCal;

import java.util.ArrayList;

import bowling.Frame;

public class Strike implements Score {
	int score;
	ArrayList<Integer> allShoot = new ArrayList<Integer>();
	
	@Override
	public int calScore(ArrayList<Frame> frames, Frame frame) {
		int index = frames.indexOf(frame);
		int bonusCount = 2;
		
		if(frame.getEachScores().size() != 1)
			return -1;
		
		if(index >= frames.size() -1)
			return -1;
		
		for (int score : frame.getEachScores()) {
			this.score += score;
		}
		
		while (index < frames.size() -1) {
			index++;
			for(int score : frames.get(index).getEachScores())
				allShoot.add(score);
		}
		
		if (allShoot.size() < 2)
			return -1;
		else {
			this.score += (allShoot.get(0) + allShoot.get(1));
			return score;
		}
			
	}
}
