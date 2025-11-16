package globalsqatestingframework.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	private WebDriver driver_dd;
	private WebDriverWait wait_dd;
	
	public DragAndDrop(WebDriver driver_t) {
		this.driver_dd = driver_t;
		this.wait_dd = new WebDriverWait(driver_dd, Duration.ofSeconds(10));
	}
	
	public void clickDragAndDrop() {
		By ddlink = By.xpath("//a[contains(text(), 'DragAndDrop')]");
		WebElement clickddlink = wait_dd.until(ExpectedConditions.elementToBeClickable(ddlink));
		
		 // Scroll to avoid ad iframe overlap
	    ((JavascriptExecutor) driver_dd).executeScript(
	            "arguments[0].scrollIntoView({block: 'center'});", clickddlink);

	    // Wait until it's really clickable
	    wait_dd.until(ExpectedConditions.elementToBeClickable(clickddlink));

	    // Click
	    clickddlink.click();
	}
	
	public void performDragAndDrop() {
		WebElement iframe1 = driver_dd.findElement(By.xpath("//iframe[@class='demo-frame'][contains(@src, '../../demoSite/practice/droppable/photo-manager.html')]"));
		driver_dd.switchTo().frame(iframe1);
		
		//Move to trash
		WebElement draggablePhoto1 = driver_dd.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
		WebElement draggablePhoto2 = driver_dd.findElement(By.xpath("//ul[@id='gallery']//li[3]"));
		
		WebElement dropPoint = driver_dd.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver_dd);
		
		act.dragAndDrop(draggablePhoto1, dropPoint).dragAndDrop(draggablePhoto2, dropPoint).perform();
		
		//Recycle
		WebElement recPhoto = driver_dd.findElement(By.xpath("//div[@id='trash']//li[1]//img[1]"));
		WebElement gallery = driver_dd.findElement(By.xpath("//ul[@id='gallery']"));
		
		act.dragAndDrop(recPhoto, gallery).perform();
	}
}
