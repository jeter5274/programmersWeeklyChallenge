package week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class week4Test {

	@Test
	void test() {
		Solution test = new Solution();
		Assertions.assertEquals("HARDWARE", 
				test.solution(new String[] {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"}, 
						new String[] {"PYTHON", "C++", "SQL"}, 
						new int[] {7, 5, 5}));
		Assertions.assertEquals("PORTAL", 
				test.solution(new String[] {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"}, 
						new String[] {"JAVA", "JAVASCRIPT"}, 
						new int[] {7, 5}));
	}

}
