package bowling;

public enum FrameStatus {
	OPEN("OPEN"), STRIKE("STRIKE"), SPARE("SPARE");
	
	private String status;
	FrameStatus(String string) {
		status = string;
	}
	
	String getStatus() {
		return status;
	}
}
