package globalsqatestingframework.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
	private WebDriver driver_f;
	private WebDriverWait frames_wait;
	
	public Frames(WebDriver driver) {
		this.driver_f = driver;
		this.frames_wait = new WebDriverWait(driver_f, Duration.ofSeconds(50));
	}
	
	public void openFramePage() {
		By framesLink = By.xpath("//div[@class='price_column ']//li[2]/a[contains(@href, 'frames-and-windows')]");
		WebElement linkf = frames_wait.until(ExpectedConditions.elementToBeClickable(framesLink));
		linkf.click();
	}
	
	public void clickOnIframeTab() {
		By iframeTab = By.xpath("//li[@id='iFrame']");
		WebElement iframeTabBtn = frames_wait.until(ExpectedConditions.elementToBeClickable(iframeTab));
		iframeTabBtn.click();
	}
	
	public void performInIframe() {
		WebElement  iframeObj = driver_f.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver_f.switchTo().frame(iframeObj);
		
		By jmeterCourse = By.xpath("//img[@alt='JMeter Training']");
		WebElement jmeterBtn = frames_wait.until(ExpectedConditions.visibilityOfElementLocated(jmeterCourse));
		
		Actions action = new Actions(driver_f);
		
		action.click().moveToElement(jmeterBtn).pause(1).perform();
		
		WebElement jmeterClick = frames_wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='info_overlay']//h3[contains(text(), 'JMeter')]")));
		jmeterClick.click();
	}
	
}
