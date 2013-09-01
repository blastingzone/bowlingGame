package bowling;

import java.util.ArrayList;

import scoreCal.Score;

public class ScoreBoard {
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
		sb.append(frameline0);
		sb.append(upperBoard);
	}
}
