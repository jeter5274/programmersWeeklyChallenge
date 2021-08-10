package week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Week1Test {

	@Test
	void test() {
		Solution test = new Solution();
		Assertions.assertEquals(10, test.solution(3, 20, 4));
	}

}
