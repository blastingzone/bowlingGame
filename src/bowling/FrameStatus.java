package bowling;

public enum FrameStatus {
	OPEN("OPEN"), STRIKE("X"), SPARE("/"), GUTTER("-");
	
	private String status;
	FrameStatus(String string) {
		status = string;
	}
	
	String getStatus() {
		return status;
	}
}
