package bowling;

import java.util.ArrayList;

import javax.lang.model.type.NullType;

import scoreCal.Open;
import scoreCal.Score;
import scoreCal.Spare;
import scoreCal.Strike;

public class ScoreBoard {
	public static final String NEWLINE = System.getProperty("line.separator");
	String upperBoard = "=========================================================================================================";
	String frameline0 = "|    1    |    2    |    3    |    4    |    5    |    6    |    7    |    8    |    9    |      10     |";

	ArrayList<Frame> frames;
	int scoreSum;
	Score score;

	void calScore() {
		for (Frame frame : frames) {
			if (frame.getStatus() == FrameStatus.OPEN) {
				score = new Open();
			}
			if (frame.getStatus() == FrameStatus.SPARE) {
				score = new Spare();
			}
			if (frame.getStatus() == FrameStatus.STRIKE) {
				score = new Strike();
			}
			frame.setScore(score.calScore(frames, frame));
		}
	}

	void showBoard() {
		createBoard();
	}

	void getFrames(ArrayList<Frame> frames) {
		this.frames = frames;
	}

	private void createBoard() {
		if(frames == null) {
			System.err.println("Frame이 없습니다!");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(upperBoard);
		sb.append(NEWLINE);
		sb.append(frameline0);
		sb.append(NEWLINE);
		sb.append(upperBoard);
		sb.append(NEWLINE);
		for (Frame fr : frames) {
			if (fr.getStatus() == FrameStatus.SPARE) {
				sb.append(fr.getEachScores().get(0));
				sb.append(" |  ");
				sb.append(FrameStatus.SPARE.getStatus());
			}
			else
				for (int num : fr.getEachScores()) {
					sb.append(" |  ");
				sb.append(symbolTrans(num));
			}
		}

		sb.append(NEWLINE);
		calScore();
		scoreSum = 0;

		for (Frame fr : frames) {
			sb.append("I   ");
			if (fr.getTotalScore() >= 0) {
				scoreSum += fr.getTotalScore();
				sb.append(Integer.toString(scoreSum));
				System.out.println(scoreSum);
			}
			sb.append("   I");
		}
		System.out.println(sb);
	}

	String symbolTrans(int score) {
		if (score == 0)
			return FrameStatus.GUTTER.getStatus();
		if (score == 10)
			return FrameStatus.STRIKE.getStatus() + " |  ";
		else
			return Integer.toString(score);
	}
}
