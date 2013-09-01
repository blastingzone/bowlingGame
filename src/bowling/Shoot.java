package bowling;

import java.util.Random;

public class Shoot {
	int hit;
	int pin;
	Random rd = new Random();
	
	Shoot(int pin) {
		this.pin = pin;
	}
	
	// hit : 0 ~ pin
	void roll() {
		hit = rd.nextInt(pin+1);
	}
	
	int getScore() {
		return hit;
	}
}
