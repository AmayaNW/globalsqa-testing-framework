package globalsqatestingframework.test;

import globalsqatestingframework.base.BaseTest;
import globalsqatestingframework.steps.FirstStep;

public class MainTest extends BaseTest {

	public static void main(String[] args) {
		MainTest test = new MainTest();
		test.setUp();
		
		
		FirstStep firststep = new FirstStep(test.driver);
		firststep.runFirstStep();
		
		//test.finish();

	}

}
