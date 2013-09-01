package bowling;

public class LastFrame extends Frame{
	final static int MAX_SHOOT_CHANCE = 3;
	
	@Override
	protected void statusCheck() {
		if(pin == 0 && shootResult.size() == 1) {
			setStatus(FrameStatus.STRIKE);
		}
		if(pin == 0 && shootResult.size() == 2) {
			if(getStatus() == FrameStatus.STRIKE)
				setStatus(FrameStatus.STRIKE);
			else
				setStatus(FrameStatus.SPARE);
		}
		if(pin != 0 && shootResult.size() == 2) {
			close();
			setStatus(FrameStatus.OPEN);
		}
		if(shootResult.size() == 3) {
			close();
			setStatus(FrameStatus.OPEN);
		}
	}
}
