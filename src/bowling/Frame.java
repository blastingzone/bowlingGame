package bowling;

public class Frame {
	final static int MAX_SHOOT_CHANCE = 2;
	private int score = 0;
	private boolean isClosedWithBonus = false;
	private FrameStatus status = FrameStatus.OPEN;
	
	void close() {
		isClosedWithBonus = true;
	}
	
	int getScore() {
		return score;
	}
	
	void setScore(int score) {
		if(isClosedWithBonus) this.score = score;
	}
	
	public boolean isFrameClosed() {
		return isClosedWithBonus;
	}
	
	FrameStatus getStatus() {
		return status;
	}
	
	void setStatus(FrameStatus status) {
		this.status = status;
	}
}
