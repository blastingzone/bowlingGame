package bowling;

import java.util.ArrayList;

public class Frame {
	final static int MAX_SHOOT_CHANCE = 2;
	private int pin = 10;
	private int score = 0;
	private boolean isClosed = false;
	private FrameStatus status = FrameStatus.OPEN;
	private ArrayList<Integer> shootResult = new ArrayList<Integer>();

	void close() {
		isClosed = true;
	}
	
	void roll() {
		if (!isClosed) {
			Shoot shoot = new Shoot(pin);
			shoot.roll();
			shootResult.add(shoot.getScore());
			pin -= shoot.getScore();
			statusCheck();
		}
	}
	
	private void statusCheck() {
		if(pin == 0 && shootResult.size() == 1) {
			isClosed = true;
			setStatus(FrameStatus.STRIKE);
		}
		if(pin == 0 && shootResult.size() == 2) {
			isClosed = true;
			setStatus(FrameStatus.SPARE);
		}
		if(pin != 0 && shootResult.size() == 2) {
			isClosed = true;
			setStatus(FrameStatus.OPEN);
		}
	}

	int getTotalScore() {
		return score;
	}

	void setScore(int score) {
		this.score = score;
	}
	
	ArrayList<Integer> getEachScores() {
		return shootResult;
	}

	public boolean isClosed() {
		return isClosed;
	}

	FrameStatus getStatus() {
		return status;
	}

	private void setStatus(FrameStatus status) {
		this.status = status;
	}
}
