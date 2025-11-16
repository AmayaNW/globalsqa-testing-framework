package globalsqatestingframework.steps;

import org.openqa.selenium.WebDriver;

import globalsqatestingframework.base.BaseTest;
import globalsqatestingframework.pages.DragAndDrop;

public class ThirdStep {
	private WebDriver driver_t;
	private BaseTest goHome_t;
	//private WebDriverWait wait_t;
	
	public ThirdStep(WebDriver driver, BaseTest goHome) {
		this.driver_t = driver;
		this.goHome_t = goHome;
	}
	
	public void runThirdStep() {
		System.out.println("Third step is running...");
		
		goHome_t.goToHomePage();
		
		DragAndDrop dd = new DragAndDrop(driver_t);
		dd.clickDragAndDrop();
		dd.performDragAndDrop();
		
		System.out.println("Third step ran successfully!");
	}
}
