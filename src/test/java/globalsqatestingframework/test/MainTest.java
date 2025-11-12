package globalsqatestingframework.test;

import globalsqatestingframework.base.BaseTest;
import globalsqatestingframework.steps.FirstStep;
import globalsqatestingframework.steps.SecondStep;

public class MainTest extends BaseTest {

	public static void main(String[] args) {
		MainTest test = new MainTest();
		test.setUp();
		
		
		FirstStep firststep = new FirstStep(test.driver);
		firststep.runFirstStep();
		
		
		SecondStep secondstep = new SecondStep(test.driver);
		secondstep.runSecondStep();
		
		//test.finish();

	}

}
