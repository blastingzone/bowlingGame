package scoreCal;

import java.util.ArrayList;

import bowling.Frame;
import junit.framework.TestCase;

public class SpareTest extends TestCase {
	ArrayList<Frame> frames = new ArrayList<Frame>();
	Frame frame = new Frame();
	
	public void testSpareCal() throws Exception {
		frames.add(new Frame());
		frame = frames.get(0);
		
		frame.roll();
		System.out.println(frame.getEachScores());
		
		int result = new Spare().calScore(frames, frame);
		System.out.println("SpareType cal : " + result);
		
		frames.get(0).roll();
		System.out.println(frame.getEachScores());
		
		result = new Spare().calScore(frames, frame);
		System.out.println("SpareType cal : " + result);
		
		frames.add(new Frame());
		
		frames.get(1).roll();
		System.out.println(frames.get(1).getEachScores());
		
		result = new Spare().calScore(frames, frame);
		System.out.println("SpareType cal : " + result);
		
		frames.get(1).roll();
		System.out.println(frames.get(1).getEachScores());
		
		result = new Spare().calScore(frames, frame);
		System.out.println("SpareType cal : " + result);
	}
}
