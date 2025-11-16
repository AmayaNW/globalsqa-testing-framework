package globalsqatestingframework.steps;

import org.openqa.selenium.WebDriver;

import globalsqatestingframework.base.BaseTest;
import globalsqatestingframework.pages.Tabs;

public class FirstStep {
	private WebDriver driverq;
	private BaseTest goHomeq;
	
	public FirstStep(WebDriver driver, BaseTest goHome) {
		this.driverq = driver;
		this.goHomeq = goHome;
	}
	
	public void runFirstStep() {
		System.out.println("First step is running...");
		
		goHomeq.goToHomePage();
		
		Tabs tab = new Tabs(driverq);
		tab.openTabsPage();
		tab.clickOnDifferentTabs();
		
		System.out.println("First step ran successfully!");
	}
	
}
