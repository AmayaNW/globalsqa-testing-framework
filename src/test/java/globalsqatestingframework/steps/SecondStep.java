package globalsqatestingframework.steps;

import org.openqa.selenium.WebDriver;

public class SecondStep {
	private WebDriver driver_s;
	
	public SecondStep(WebDriver driver) {
		this.driver_s = driver;
	}
	
	public void runSecondStep() {
		System.out.println("Second step is running...");
	}
}
