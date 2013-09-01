package bowling;

import junit.framework.TestCase;

public class FrameTest extends TestCase {
	
	public void testClose() throws Exception {
		Frame testFrame = new Frame();
		testFrame.close();
		assertTrue(testFrame.isFrameClosed());
	}
	
	public void testname() throws Exception {
		Frame testFrame = new Frame();
		assertEquals(0, testFrame.getTotalScore());
		
		testFrame.setScore(10);
		assertEquals(0, testFrame.getTotalScore());
		
		testFrame.close();
		testFrame.setScore(10);
		assertEquals(10, testFrame.getTotalScore());
	}
}
