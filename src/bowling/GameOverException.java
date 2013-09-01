package bowling;

public class GameOverException extends Exception {
	GameOverException() {
		System.err.println("게임이 끝났습니다!");
	}
}
