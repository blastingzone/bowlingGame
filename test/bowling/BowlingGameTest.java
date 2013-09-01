package bowling;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	public void testCreate() throws Exception {
		BowlingGame bg = new BowlingGame(1);
		bg.gameStart();
	}
}
