package diagnostictest;

public class Test {

	String f(int i) {
		switch (i) {
		case 0:	return "A";
		case 1: return "B";
		case 2: return "C";
		//default: throw new AssertionError();			
		}
		return "sss";
	}
}
