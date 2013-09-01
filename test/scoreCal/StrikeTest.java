package scoreCal;

import java.util.ArrayList;

import bowling.Frame;
import junit.framework.TestCase;

public class StrikeTest extends TestCase {
	ArrayList<Frame> frames = new ArrayList<Frame>();
	Frame frame = new Frame();
	
	public void testStrikeCal() throws Exception {
		frames.add(new Frame());
		frame = frames.get(0);
		
		frame.roll();
		System.out.println(frame.getEachScores());
		
		int result = new Strike().calScore(frames, frame);
		System.out.println("StrikeType cal : " + result);
		
		frames.get(0).roll();
		System.out.println(frame.getEachScores());
		
		result = new Strike().calScore(frames, frame);
		System.out.println("StrikeType cal : " + result);
		
		frames.add(new Frame());
		
		frames.get(1).roll();
		System.out.println(frames.get(1).getEachScores());
		
		result = new Strike().calScore(frames, frame);
		System.out.println("StrikeType cal : " + result);
		
		frames.get(1).roll();
		System.out.println(frames.get(1).getEachScores());
		
		result = new Strike().calScore(frames, frame);
		System.out.println("StrikeType cal : " + result);
	}
}
