package scoreCal;

import java.util.ArrayList;

import bowling.Frame;

public interface Score {
	
	int calScore(ArrayList<Frame> frames, Frame frame);

}
