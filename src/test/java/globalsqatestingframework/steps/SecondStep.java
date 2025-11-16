package globalsqatestingframework.steps;

import org.openqa.selenium.WebDriver;

import globalsqatestingframework.base.BaseTest;
import globalsqatestingframework.pages.Frames;

public class SecondStep {
	private WebDriver driver_s;
	private BaseTest goHome_s;
	
	public SecondStep(WebDriver driver, BaseTest goHome) {
		this.driver_s = driver;
		this.goHome_s = goHome;
	}
	
	public void runSecondStep() {
		System.out.println("Second step is running...");
		
		goHome_s.goToHomePage();
		
		Frames frames = new Frames(driver_s);
		frames.openFramePage();
		frames.clickOnIframeTab();
		//frames.performInIframe();
		
		System.out.println("Second step ran successfully!");
	}
}
