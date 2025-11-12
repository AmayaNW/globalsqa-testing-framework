package globalsqatestingframework.steps;

import org.openqa.selenium.WebDriver;

import globalsqatestingframework.pages.Tabs;

public class FirstStep {
	private WebDriver driverq;
	
	public FirstStep(WebDriver driver) {
		this.driverq = driver;
	}
	
	public void runFirstStep() {
		System.out.println("First step is running...");
		
		Tabs tab = new Tabs(driverq);
		tab.openTabsPage();
		tab.clickOnDifferentTabs();
		
		System.out.println("First step ran successfully!");
	}
	
}
