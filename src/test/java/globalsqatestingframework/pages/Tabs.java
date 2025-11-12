package globalsqatestingframework.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tabs {
	private WebDriver driverqT;
	private WebDriverWait wait;
	
	public Tabs(WebDriver driverq) {
		this.driverqT = driverq;
		this.wait = new WebDriverWait(driverq, Duration.ofSeconds(10));
	}
	
	public void openTabsPage() {
		//driverqT.switchTo().newWindow(WindowType.TAB);
		//driverqT.get(url);
		By tabsLink = By.xpath("//div[@class='price_column ']//li[2]/a[contains(@href, 'accordion-and-tabs')]");
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(tabsLink));
		link.click();
	}
	
	public void clickOnDifferentTabs() {
		changeTab(2);
		changeTab(3);
		changeTab(1);
		changeTab(2);
	}
	
	public void changeTab(int tabNumber) {
		By tab = By.xpath("//div[@class='newtabs horizontal']//li["+tabNumber+"]");
		WebElement clickTab = wait.until(ExpectedConditions.elementToBeClickable(tab));
		clickTab.click();
	}
}
