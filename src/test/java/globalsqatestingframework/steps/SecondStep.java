package globalsqatestingframework.steps;

import org.openqa.selenium.WebDriver;

import globalsqatestingframework.pages.Frames;

public class SecondStep {
	private WebDriver driver_s;
	
	public SecondStep(WebDriver driver) {
		this.driver_s = driver;
	}
	
	public void runSecondStep() {
		System.out.println("Second step is running...");
		
		Frames frames = new Frames(driver_s);
		frames.openFramePage();
		frames.clickOnIframeTab();
		frames.performInIframe();
		
		System.out.println("Second step ran successfully!");
	}
}
