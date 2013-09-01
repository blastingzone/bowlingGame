package bowling;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	public void testCreate() throws Exception {
		User user = new User();
		System.out.println(user.getFrame());
		user.roll();
		System.out.println(user.getFrame());
		user.roll();
		System.out.println(user.getFrame());
	}
}
