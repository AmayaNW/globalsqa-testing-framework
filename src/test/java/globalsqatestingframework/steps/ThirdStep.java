package globalsqatestingframework.steps;

import org.openqa.selenium.WebDriver;

import globalsqatestingframework.pages.DragAndDrop;

public class ThirdStep {
	private WebDriver driver_t;
	//private WebDriverWait wait_t;
	
	public ThirdStep(WebDriver driver) {
		this.driver_t = driver;
	}
	
	public void runThirdStep() {
		System.out.println("Third step is running...");
		
		DragAndDrop dd = new DragAndDrop(driver_t);
		dd.clickDragAndDrop();
		dd.performDragAndDrop();
		
		System.out.println("Third step ran successfully!");
	}
}
