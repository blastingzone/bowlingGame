package bowling;

import junit.framework.TestCase;

public class FrameTest extends TestCase {
	
	public void testClose() throws Exception {
		Frame testFrame = new Frame();
		testFrame.close();
		assertTrue(testFrame.isClosed());
	}
	
	public void testname() throws Exception {
		Frame testFrame = new Frame();
		assertEquals(0, testFrame.getTotalScore());
		
		testFrame.setScore(10);
		assertEquals(10, testFrame.getTotalScore());
	}
	
	public void testRoll() throws Exception {
		Frame testFrame = new Frame();
		testFrame.roll();
		System.out.println(testFrame.getEachScores());
		testFrame.roll();
		System.out.println(testFrame.getEachScores());
		testFrame.roll();
		System.out.println(testFrame.getEachScores());
		assertTrue(testFrame.isClosed());
	}
	
	public void testGetStatus() throws Exception {
		Frame testFrame = new Frame();
		assertEquals(FrameStatus.OPEN, testFrame.getStatus());
	}
}
