package bowling;

import java.util.ArrayList;

public class Frame {
	final static int MAX_SHOOT_CHANCE = 2;
	protected int pin = 10;
	protected int score = 0;
	protected boolean isClosed = false;
	protected FrameStatus status = FrameStatus.OPEN;
	protected ArrayList<Integer> shootResult = new ArrayList<Integer>();

	void close() {
		isClosed = true;
	}
	
	public void roll() {
		if (!isClosed) {
			Shoot shoot = new Shoot(pin);
			shoot.roll();
			shootResult.add(shoot.getScore());
			pin -= shoot.getScore();
			statusCheck();
		}
	}
	
	protected void statusCheck() {
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
	
	public ArrayList<Integer> getEachScores() {
		return shootResult;
	}

	public boolean isClosed() {
		return isClosed;
	}

	FrameStatus getStatus() {
		return status;
	}

	protected void setStatus(FrameStatus status) {
		this.status = status;
	}
}
