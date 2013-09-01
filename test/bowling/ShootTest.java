package bowling;

import junit.framework.TestCase;

public class ShootTest extends TestCase {
	public void testCreate() throws Exception {
		Shoot testShoot = new Shoot(10);
		assertEquals(0, testShoot.getScore());
	}
	
	public void testRoll() throws Exception {
		Shoot testShoot = new Shoot(10);
		testShoot.roll();
		assertEquals(testShoot.hit, testShoot.getScore());
	}
}
