package bowling;

public class Bowling {
	
	int[] rolls = new int[21];
	int rollIndex = 0;

	public void roll(int pinsKnockedDown) {
		rolls[rollIndex++] = pinsKnockedDown;
	}

	public int getScore() {
        int sum = 0;
        int rollsIndex = 0;
        int total = 10;

		for (int frame = 0; frame < total; frame++) {
			if(rolls[rollsIndex] == 10) {
				sum += 10 + rolls[rollsIndex + 1] + rolls[rollsIndex + 2];
				rollsIndex += 1;
			} else if (rolls[rollsIndex] + rolls[rollsIndex + 1] == 10) {
				sum += 10 + rolls[rollsIndex + 2];
				rollsIndex += 2;
			} else {
				sum += rolls[rollsIndex] + rolls[rollsIndex + 1];
				rollsIndex += 2;
			}
		}

		return sum;
	}
}
