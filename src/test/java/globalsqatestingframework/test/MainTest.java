package globalsqatestingframework.test;

import globalsqatestingframework.base.BaseTest;
import globalsqatestingframework.steps.ThirdStep;

public class MainTest extends BaseTest {

	public static void main(String[] args) {
		MainTest test = new MainTest();
		test.setUp();
		
		
		//FirstStep firststep = new FirstStep(test.driver);
		//firststep.runFirstStep();
		
		
		//SecondStep secondstep = new SecondStep(test.driver);
		//secondstep.runSecondStep();
		
		ThirdStep thirdstep = new ThirdStep(test.driver);
		thirdstep.runThirdStep();
		
		//test.finish();

	}

}
