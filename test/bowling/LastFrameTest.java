package bowling;

import junit.framework.TestCase;

public class LastFrameTest extends TestCase {
	public void testCreate() throws Exception {
		LastFrame lf = new LastFrame();
		assertTrue(lf.getStatus() == FrameStatus.OPEN);
	}
	
	public void testRoll() throws Exception {
		LastFrame lf = new LastFrame();
		lf.roll();
		System.out.println(lf.getEachScores());
		System.out.println(lf.getStatus());
		lf.roll();
		System.out.println(lf.getEachScores());
		System.out.println(lf.getStatus());
		lf.roll();
		System.out.println(lf.getEachScores());
		System.out.println(lf.getStatus());
	}
}
