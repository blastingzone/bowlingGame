package bowling;

import java.util.ArrayList;

import scoreCal.Open;
import scoreCal.Score;
import scoreCal.Spare;
import scoreCal.Strike;

public class ScoreBoard {
	public static final String NEWLINE = System.getProperty("line.separator");
	String upperBoard = "=====================================================================================";
	String frameline0 = "|   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |     10    |";
	String showBoard;
	
	ArrayList<Frame> frames;
	int ScoreSum;
	Score score;
	
	ScoreBoard () {
		createBoard();
	}
	
	void calScore() {
		for (Frame frame : frames) {
			if(frame.getStatus() == FrameStatus.OPEN) {
				score = new Open();
			}
			if(frame.getStatus() == FrameStatus.SPARE) {
				score = new Spare();
			}
			if(frame.getStatus() == FrameStatus.STRIKE) {
				score = new Strike();
			}
			frame.setScore(score.calScore(frames, frame));
		}
	}
	
	void showBoard() {
		System.out.println(showBoard);
	}
	
	void getFrames(ArrayList<Frame> frames) {
		this.frames = frames;
	}
	
	void createBoard() {
		StringBuilder sb = new StringBuilder();
		sb.append(upperBoard);
		sb.append(NEWLINE);
		sb.append(frameline0);
		sb.append(NEWLINE);
		sb.append(upperBoard);
		sb.append(NEWLINE);
		System.out.println(sb);
	}
}
