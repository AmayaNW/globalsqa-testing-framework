package globalsqatestingframework.test;

import globalsqatestingframework.base.BaseTest;
import globalsqatestingframework.steps.FirstStep;
import globalsqatestingframework.steps.SecondStep;
import globalsqatestingframework.steps.ThirdStep;

public class MainTest extends BaseTest {

	public static void main(String[] args) {
		MainTest test = new MainTest();
		test.setUp();
		
		
		FirstStep firststep = new FirstStep(test.driver, test);
		firststep.runFirstStep();
		
		
		SecondStep secondstep = new SecondStep(test.driver, test);
		secondstep.runSecondStep();
		
		ThirdStep thirdstep = new ThirdStep(test.driver, test);
		thirdstep.runThirdStep();
		
		//test.finish();

	}

}
